package com.minab.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class SoruAddRequestDto {
    String soru;
    Integer puan;
    Integer sure;
    List<SoruCevap> cevaplar;

    @AllArgsConstructor
    @RequiredArgsConstructor
    @Builder
    @Data
    public static class SoruCevap{
        String cevap;
        String secenekNo;
        Boolean dogruCevap;
    }
}
