package com.jumperro.git.ShoppingList.welcome;

import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
@Service
 public class WelcomeService {
    public static final String fallback_name = "unnamed_one";


    public WelcomeService() {}

     public String PrepareGreeting(String name){
        String welcomeMsg = "Hello";
        String nameToWelcome = Optional.ofNullable(name).orElse(fallback_name);
        return welcomeMsg + " " + nameToWelcome + " !";

    }
}
