package com.minab.service;


import com.minab.repository.SoruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SoruService {
    private final SoruRepository soruRepository;
}
