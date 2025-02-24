package com.javapaulo.agendadortarefas.business.mapper;

import com.javapaulo.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.javapaulo.agendadortarefas.business.dto.TarefasDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);
}
