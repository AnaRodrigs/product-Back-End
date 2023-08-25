package com.example.productbackend.mappers;

import com.example.productbackend.dtos.ProductRequest;
import com.example.productbackend.entities.Product;

public class ProductMapper {
    
    public static Product toEntity(ProductRequest request){
        Product product = new Product();
        product.setName(request.name());
        product.setPrice(request.price());
        return product;
    }
}
