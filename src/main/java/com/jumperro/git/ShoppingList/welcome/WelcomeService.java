package com.jumperro.git.ShoppingList.welcome;

import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
@Service
 public class WelcomeService {
    public static final String fallback_name = "unnamed_one";


    public WelcomeService() {}

     public String PrepareGreeting(String name){
       // Objects.requireNonNull(name, "Please provide a name");
        String welcomeMsg = "Hello";
        String nameToWelcome;
        // nameToWelcome = Optional.ofNullable(name).orElse(fallback_name);
        if(name.isBlank() || name.isEmpty()){
            nameToWelcome = fallback_name;
        }
        else
            nameToWelcome = name;
         return welcomeMsg + " " + nameToWelcome + " !";

    }
}
