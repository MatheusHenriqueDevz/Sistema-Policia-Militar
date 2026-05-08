package com.policiamilitar.service;

import com.policiamilitar.repository.BatalhaoRepository;
import org.springframework.stereotype.Service;

@Service
public class BatalhaoService {

    private final BatalhaoRepository batalhaoRepository;

    public BatalhaoService(BatalhaoRepository batalhaoRepository) {
        this.batalhaoRepository = batalhaoRepository;
    }
}
