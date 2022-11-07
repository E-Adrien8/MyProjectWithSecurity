package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;


@RestController
public class ShieldController {

    @GetMapping("/")
    public String shield() {
        return "Welcome to the SHIELD";
    }

    @RolesAllowed("CHAMPION")
    @GetMapping("/avengers/assemble")
    public String admin() {
        return "Avengers ... Assemble";
    }

    @RolesAllowed("DIRECTOR")
    @GetMapping("/secret-bases")
    public String secretBases() {
        return "Nos campus WCS : Biarritz\n" +
                "Bordeaux\n" +
                "La Loupe\n" +
                "Lille\n" +
                "Lyon\n" +
                "Marseille\n" +
                "Nantes\n" +
                "Orléans\n" +
                "Paris\n" +
                "Reims\n" +
                "Strasbourg\n" +
                "Toulouse\n" +
                "Tours";
    }
}