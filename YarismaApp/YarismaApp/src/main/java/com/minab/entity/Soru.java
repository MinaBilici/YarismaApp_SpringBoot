package com.minab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String soru;
    Integer sure;
    Integer puan;


}
