package com.gmala.magazator.service;


import com.gmala.magazator.model.AuthoritiesEntity;
import com.gmala.magazator.model.Role;
import com.gmala.magazator.model.UsersEntity;
import com.gmala.magazator.repository.AuthoritiesRepository;
import com.gmala.magazator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Service
@Transactional
public class registerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthoritiesRepository authoritiesRepository;

    @Autowired
    private EmailService emailService;


    public boolean addUser(UsersEntity usersEntity, Role role) {

        String verification = UUID.randomUUID().toString();

        try {
            AuthoritiesEntity authoritiesEntity = new AuthoritiesEntity();
            authoritiesEntity.setAuthority(role);
            authoritiesEntity.setUsername(usersEntity.getUsername());
            //usersEntity.setEnabled("1");
            usersEntity.setVerification(verification);
            this.userRepository.save(usersEntity);
            this.authoritiesRepository.save(authoritiesEntity);
        } catch(Exception e){

            return false;
        }
        this.emailService.sendActivationEmail(usersEntity.getEmail(), verification);
        return true;
    }

    public boolean verifyUser(String verificationId){
        /*
            UserEntity user = this.userRepository.findByVerificationId(verificationId);
            ....allazei se "VERIFIED", kai enabled=1.
            Sto ekshs an enas user einai VERIFIED me enabled=0, einai apla banned.
         */
        try{
            //this.userRepository.verifyUser(verificationId);
        }catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }



}
