package com.jumperro.git.ShoppingList.welcome;

import com.jumperro.git.ShoppingList.AppLogger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.WebServlet;

@RestController
@WebServlet(name = "Karol", urlPatterns = {"/api"})
class WelcomeController implements AppLogger {

    private final WelcomeService service;

    WelcomeController(WelcomeService service) {

        this.service = service;
    }

    @GetMapping(value = "/api")
    String welcome() {
        return welcome("unnamed_one");
    }

    @GetMapping(value = "/api", params = {"name"})
    String welcome(@RequestParam String name) {
        AppLogger.logger.info("Reguest get");
        return service.PrepareGreeting(name);
    }
}
