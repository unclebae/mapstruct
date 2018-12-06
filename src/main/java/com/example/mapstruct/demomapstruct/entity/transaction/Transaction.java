package com.example.mapstruct.demomapstruct.entity.transaction;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Transaction {
    private Long id;
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;
}
