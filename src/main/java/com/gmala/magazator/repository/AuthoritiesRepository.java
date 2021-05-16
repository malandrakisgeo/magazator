package com.gmala.magazator.repository;

import com.gmala.magazator.model.AuthoritiesEntity;
import com.gmala.magazator.model.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AuthoritiesRepository extends CrudRepository<AuthoritiesEntity, Integer> {
}
