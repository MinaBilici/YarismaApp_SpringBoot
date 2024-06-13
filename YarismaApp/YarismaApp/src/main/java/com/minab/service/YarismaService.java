package com.minab.service;


import com.minab.repository.YarismaRepository;
import com.minab.repository.YarismaSoruRepository;
import com.minab.repository.YarismaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YarismaService {
    private final YarismaRepository yarismaRepository;
    private final YarismaSoruRepository yarismaSoruRepository;
    private final YarismaUserRepository yarismaUserRepository;
}
