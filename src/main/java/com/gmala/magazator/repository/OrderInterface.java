package com.gmala.magazator.repository;

import com.gmala.magazator.model.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderInterface extends CrudRepository<OrdersEntity, Integer> {

}
