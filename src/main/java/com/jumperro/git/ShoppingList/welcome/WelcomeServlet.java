package com.jumperro.git.ShoppingList.welcome;

import com.jumperro.git.ShoppingList.AppLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;

@RestController
@WebServlet(name = "Karol", urlPatterns = {"/api"})
 class WelcomeServlet implements AppLogger {
    private final WelcomeService service;

WelcomeServlet(WelcomeService service){
this.service=service;
}

@GetMapping(value = "/api")
String welcome(){
    return welcome(null);
}
@GetMapping(value = "/api", params = {"name"})
        String welcome(@RequestParam String name) {
        AppLogger.logger.info("Reguest get");
        return service.PrepareGreeting(name);

    }
}
