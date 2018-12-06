package com.example.mapstruct.demomapstruct.entity.product;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDTO {
    private Long no;
    private String name;
    private ProductDetailDTO productDetail;
}
