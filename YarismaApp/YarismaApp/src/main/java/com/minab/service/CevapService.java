package com.minab.service;


import com.minab.repository.CevapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CevapService {
    private final CevapRepository cevapRepository;
}
