package com.busify.service;

import com.busify.model.User;

import java.util.Optional;

public interface UserService {

    /**
     * Finds user by id.
     *
     * @param id of the user.
     * @return Optional wrapper of the user.
     */
    Optional<User> findById(Integer id);
}
