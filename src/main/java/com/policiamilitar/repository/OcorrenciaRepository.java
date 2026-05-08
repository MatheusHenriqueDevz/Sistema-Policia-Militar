package com.policiamilitar.repository;

import com.policiamilitar.model.entity.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia,Long> {
}
