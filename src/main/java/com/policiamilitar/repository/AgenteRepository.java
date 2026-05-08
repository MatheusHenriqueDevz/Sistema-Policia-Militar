package com.policiamilitar.repository;

import com.policiamilitar.model.entity.Agente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenteRepository extends JpaRepository<Agente, Long> {
}
