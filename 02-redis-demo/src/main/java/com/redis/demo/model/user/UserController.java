package com.redis.demo.model.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User postMapping(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public Iterable<User> getMapping(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getMappingById(@PathVariable int id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMapping(@PathVariable int id){
        userService.deleteById(id);
    }

}
