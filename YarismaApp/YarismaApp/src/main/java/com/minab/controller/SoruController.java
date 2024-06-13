package com.minab.controller;


import com.minab.dto.request.SoruAddRequestDto;
import com.minab.service.CevapService;
import com.minab.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.minab.constant.EndPoints.SAVE;
import static com.minab.constant.EndPoints.SORU;

@RestController
@RequestMapping(SORU)
@RequiredArgsConstructor
public class SoruController {
    private final SoruService soruService;
    private final CevapService cevapService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody SoruAddRequestDto dto) {
        System.out.println(dto);
        return ResponseEntity.ok().build();
    }


}
