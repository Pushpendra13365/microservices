package com.programming.controller;

import com.programming.dto.ProductRequest;
import com.programming.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody ProductRequest productRequest){

    }
}
