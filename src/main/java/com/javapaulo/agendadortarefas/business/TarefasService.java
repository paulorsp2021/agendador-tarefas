package com.javapaulo.agendadortarefas.business;

import com.javapaulo.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.javapaulo.agendadortarefas.Infrastructure.enums.StatusNotificationEnum;
import com.javapaulo.agendadortarefas.Infrastructure.repository.TarefasRepository;
import com.javapaulo.agendadortarefas.Infrastructure.security.JwtUtil;
import com.javapaulo.agendadortarefas.business.dto.TarefasDTO;
import com.javapaulo.agendadortarefas.business.mapper.TarefasConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token,TarefasDTO dto){
        String email = jwtUtil.extractEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificationEnum(StatusNotificationEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefasConverter.paraTarefaEntity(dto);
        return tarefasConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }
}
