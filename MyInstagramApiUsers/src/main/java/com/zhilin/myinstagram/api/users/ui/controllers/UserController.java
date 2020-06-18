package com.zhilin.myinstagram.api.users.ui.controllers;

import com.zhilin.myinstagram.api.users.ui.model.CreateUserRequestModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/status/check")
    public String status(){
        return "Good Job!";
    }

    @PostMapping
    public String create(@Valid @RequestBody CreateUserRequestModel userRequestModel) {
     //   User user = new User(username, email, password);
     //   return userRepository.save(user);
        return "success";
    }

}
