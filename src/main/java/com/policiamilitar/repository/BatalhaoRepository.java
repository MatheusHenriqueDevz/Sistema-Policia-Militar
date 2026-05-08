package com.policiamilitar.repository;

import com.policiamilitar.model.entity.Batalhao;
import com.policiamilitar.model.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatalhaoRepository extends JpaRepository<Batalhao,Long> {
}
