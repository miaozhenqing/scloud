package com.zq.controller;

import java.util.List;

import com.zq.config.ServerConfig;
import com.zq.pojo.Product;
import com.zq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    ServerConfig serverConfig;
    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("version", serverConfig.getVersion());
        m.addAttribute("ps", ps);
        return "products";
    }
}
