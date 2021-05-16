package com.gmala.magazator.repository;

import com.gmala.magazator.model.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UsersEntity, Integer> {

   // @Query("select u from users u where u.verification = ?1")
   // UsersEntity userByVerificationNumber(String verificationNumber);

    //@Query("update users u set u.verified='1' where u.verification = ?1")
    //void verifyUser(String verificationNumber);


}



