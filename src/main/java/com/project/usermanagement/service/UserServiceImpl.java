package com.project.usermanagement.service;


import com.project.usermanagement.entity.User;
import com.project.usermanagement.exception.UserNotFoundException;
import com.project.usermanagement.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new UserNotFoundException("User not found with id" + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        User existingUser = getUserById(id);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        return userRepository.save(existingUser);
    }

    @Override
    public User deleteUser(Long id) {
        return userRepository.deleteById(id);
    }
}