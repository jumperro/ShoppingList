package com.jumperro.git.ShoppingList.welcome;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WelcomeService {
    public static final String fallback_name = "unnamed_one";


    public WelcomeService() {
    }

    public String PrepareGreeting(String name) {
        String welcomeMsg = "shopping list.";
        String nameToWelcome;
        if(name.equals(null) || name.isEmpty()) {
            nameToWelcome = fallback_name;
        }
        else {
            nameToWelcome = name;
        }
        return nameToWelcome + "'s" + " " + welcomeMsg + " !";

    }
}
