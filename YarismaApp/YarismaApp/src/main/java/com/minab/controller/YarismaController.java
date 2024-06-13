package com.minab.controller;


import com.minab.service.YarismaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.minab.constant.EndPoints.YARISMA;

@RestController
@RequestMapping(YARISMA)
@RequiredArgsConstructor
public class YarismaController {
    private final YarismaService yarismaService;
}
