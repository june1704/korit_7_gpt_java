package com.korit.service;

import com.korit.entity.User;
import com.korit.repository.UserRepository;

public class UserServiceImpl implements UserService {
    @Override
    public void add(User user) {
        UserRepository.getInstance().addUser(user);

        // UserRepository userRepository = UserRepository.getInstance();
        // userRepository.addUser(user);
    }

    @Override
    public void remove() {

    }

    @Override
    public void printInfo() {

    }
}
