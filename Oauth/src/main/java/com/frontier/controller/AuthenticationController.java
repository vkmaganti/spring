package com.frontier.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by vmaganti on 10/14/16.
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthenticationController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}
