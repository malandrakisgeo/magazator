package com.gmala.magazator.controller;

import com.gmala.magazator.model.ProductEntity;
import com.gmala.magazator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    public ArrayList<ProductEntity> popularProducts;

    /**
        Retrieves a list with the 20 most popular products for the home page.
        The popularity is based on the number of orders that contain a particular product code.
     TODO: Implement a smarter algorithm, e.g. someone that takes time into account
        (a product sold 800 times in 3 years is less popular than a product sold 100 times in a month).
     */
    @GetMapping("/getPopular")
    public ModelAndView getPopular() {
        this.popularProducts = productService.getPopularProducts();

        return new ModelAndView("home");
    }


}
