package com.policiamilitar.service;

import com.policiamilitar.repository.ProprietarioRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    private ProprietarioRepository proprietarioRepository;

    public VeiculoService(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }
}
