package ru.peach.hosting.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.peach.hosting.Model.User;
import static org.springframework.http.ResponseEntity.ok;


@SuppressWarnings("all")
@RestController
public class AuthenticationController {

    @CrossOrigin
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<User> Login(@RequestBody User user) {
        System.out.println(user);
        return ok(user);
    }


    @CrossOrigin
    @PostMapping("/register")
    @ResponseBody
    public Object Register(@RequestBody User user)  { return ok(user); }
}
