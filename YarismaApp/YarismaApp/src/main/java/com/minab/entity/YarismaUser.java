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
@Table(name = "tbl_yarisma_user")
public class YarismaUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long yarismaId;
    Long userId;

}
