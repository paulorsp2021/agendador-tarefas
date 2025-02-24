package com.javapaulo.agendadortarefas.Infrastructure.repository;

import com.javapaulo.agendadortarefas.Infrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
