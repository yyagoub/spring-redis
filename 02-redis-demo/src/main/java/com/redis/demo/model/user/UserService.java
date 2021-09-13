package com.redis.demo.model.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void deleteById(int id){
        userRepository.deleteById(id);
    }
}
