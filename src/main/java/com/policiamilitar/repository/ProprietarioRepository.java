package com.policiamilitar.repository;

import com.policiamilitar.model.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietarioRepository extends JpaRepository<Veiculo,Long> {
}
