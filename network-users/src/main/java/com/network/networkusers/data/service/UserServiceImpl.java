package com.network.networkusers.data.service;

import com.network.networkusers.data.model.User;
import com.network.networkusers.data.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author SIE
 */
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(String id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
    }

    @Override
    public boolean exist(String id) {
        return userRepository.existsById(id);
    }

    @Override
    public void addUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public List<User> getAllByIds(List<String> ids) {
        return userRepository.findAllByListOfIds(ids);
    }

    @Override
    public String authUser(String email, String password) {
        Optional<User> user = userRepository.findByEmailAndPassword(email, password);
        return user.map(User::getId).orElse(null);
    }
}
