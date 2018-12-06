package com.example.mapstruct.demomapstruct.entity.product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDetailDTO {
    private double price;
    private double tax;
    private int size;
    private double weight;
}
