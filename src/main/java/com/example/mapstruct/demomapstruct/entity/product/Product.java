package com.example.mapstruct.demomapstruct.entity.product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
    private Long no;
    private String name;
    private ProductDetail productDetail;
}
