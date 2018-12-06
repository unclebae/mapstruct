package com.example.mapstruct.demomapstruct.mapper;

import com.example.mapstruct.demomapstruct.entity.product.Product;
import com.example.mapstruct.demomapstruct.entity.product.ProductDTO;
import com.example.mapstruct.demomapstruct.entity.product.ProductDetail;
import com.example.mapstruct.demomapstruct.entity.product.ProductDetailDTO;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductMapperTest {

    ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Test
    public void convertToProduct() {
        ProductDTO productDTO = createProductDTOFixtureWithProductDetailDTO();
        final Product product = mapper.convertToProduct(productDTO);

        assertEquals(productDTO.getNo(), product.getNo());
        assertEquals(productDTO.getName(), product.getName());
        assertTrue(productDTO.getProductDetail().getPrice() == product.getProductDetail().getPrice());
    }

    @Test
    public void convertToProductDTO() {
        final Product product = createProductFixtureWithProductDetail();
        final ProductDTO productDTO = mapper.convertToProductDTO(product);

        assertEquals(productDTO.getNo(), product.getNo());
        assertEquals(productDTO.getName(), product.getName());
        assertTrue(productDTO.getProductDetail().getPrice() == product.getProductDetail().getPrice());

    }

    private Product createProductFixtureWithProductDetail() {
        return Product.builder()
                .no(44222L)
                .name("허리보")
                .productDetail(createProductDetailFixture())
                .build();
    }

    private ProductDetail createProductDetailFixture() {

        return ProductDetail.builder()
                .price(3500)
                .tax(300)
                .size(100)
                .weight(1250)
                .build();
    }

    private ProductDTO createProductDTOFixtureWithProductDetailDTO() {
        return ProductDTO.builder()
                .no(12345L)
                .name("하기수")
                .productDetail(createProductDetailDTOFixture())
                .build();
    }

    private ProductDetailDTO createProductDetailDTOFixture() {

        return ProductDetailDTO.builder()
                .price(12500)
                .tax(1250)
                .size(10)
                .weight(10)
                .build();
    }
}
