package com.policiamilitar.service;

import com.policiamilitar.repository.ProprietarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    public ProprietarioService(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }
}
