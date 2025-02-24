package com.javapaulo.agendadortarefas.business.mapper;

import com.javapaulo.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.javapaulo.agendadortarefas.business.dto.TarefasDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
