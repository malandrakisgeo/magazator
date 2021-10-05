package com.gmala.magazator.controller;

import com.gmala.magazator.model.Role;
import com.gmala.magazator.model.UsersEntity;
import com.gmala.magazator.repository.UserRepository;
import com.gmala.magazator.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registerController {

    @Autowired
    private registerService regserv;

    @GetMapping("/register")
    public ModelAndView registerView(Model model) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setEnabled("1");
        model.addAttribute("UsersEntity",usersEntity);

        return new ModelAndView("register");
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(UsersEntity user) {
        //Otan paizeis me formes to Spring "mperdevetai" an valeis @RequestBody
        if(this.regserv.addUser(user, Role.ROLE_USER)){
            return new ResponseEntity<String>( HttpStatus.OK);
        }
        return new ResponseEntity<String>( HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/verify")
    public ResponseEntity<String> verifyUser() {

        return new ResponseEntity<String>( HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/verify/{verificationId}")
    public ResponseEntity<String> verifyFirstTime(@PathVariable String verificationId) {
        if(this.regserv.verifyUser(verificationId)){
            return new ResponseEntity<>( HttpStatus.OK);
        }
        return new ResponseEntity<String>( HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
