package com.example.mapstruct.demomapstruct.entity.transaction;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TransactionDTO {
    private String uuid;
    private Long totalInCents;
}
