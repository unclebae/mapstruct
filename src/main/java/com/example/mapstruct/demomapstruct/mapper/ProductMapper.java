package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.product.Product;
import com.example.mapstruct.demomapstruct.entity.product.ProductDTO;
import com.example.mapstruct.demomapstruct.entity.product.ProductDetail;
import com.example.mapstruct.demomapstruct.entity.product.ProductDetailDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    Product convertToProduct(ProductDTO productDTO);
    ProductDTO convertToProductDTO(Product product);
    ProductDetail convertToProductDetail(ProductDetailDTO productDetailDTO);
    ProductDetailDTO convertToProductDetailDTO(ProductDetail productDetail);
}
