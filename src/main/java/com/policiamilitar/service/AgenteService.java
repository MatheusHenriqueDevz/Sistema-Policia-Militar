package com.policiamilitar.service;

import com.policiamilitar.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

@Service
public class AgenteService {

    private final OcorrenciaRepository ocorrenciaRepository;

    public AgenteService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }
}
