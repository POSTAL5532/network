package com.network.networkusers.data.service;

import com.network.networkusers.data.model.User;

import java.util.List;

/**
 * @author SIE
 */
public interface UserService {

    User getUser(String id);

    boolean exist(String id);

    void addUser(User newUser);

    List<User> getAllByIds(List<String> ids);
}
