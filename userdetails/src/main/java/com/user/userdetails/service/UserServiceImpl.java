package com.user.userdetails.service;

import java.util.ArrayList;
import java.util.List;

import com.user.userdetails.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> list = new ArrayList<>();

    static {

        User user1 = new User(1, "Osaid");
        User user2 = new User(2, "Owais");
        User user3 = new User(3, "Ravi");

        list.add(user1);
        list.add(user2);
        list.add(user3);
    }

    @Override
    public User getUser(int id) {
        for (User user : list) {
            if (user.getId() == (id)) {
                return user;
            }
        }
        return null;
    }

}
