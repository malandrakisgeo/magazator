package com.gmala.magazator.service;

import com.gmala.magazator.model.ProductEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Service
@Transactional
public class ProductService {


    public ArrayList<ProductEntity> getPopularProducts(){
        return  null;
    }
}
