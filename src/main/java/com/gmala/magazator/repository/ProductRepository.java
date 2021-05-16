package com.gmala.magazator.repository;

import com.gmala.magazator.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<ProductEntity, Integer> {


}
