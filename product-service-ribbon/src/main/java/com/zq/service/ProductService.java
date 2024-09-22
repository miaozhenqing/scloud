package com.zq.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zq.pojo.Product;


@Service
public class ProductService {
    @Autowired ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProducts();

    }
}

