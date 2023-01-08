package com.example.restdocsexample.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<Response> index() {

        return ResponseEntity.ok(new Response(new Contact("Jane Doe", "jane.doe@example.com")));
    }

    record Response(Contact contact) {
    }

    record Contact(String email, String name) {
    }
}
