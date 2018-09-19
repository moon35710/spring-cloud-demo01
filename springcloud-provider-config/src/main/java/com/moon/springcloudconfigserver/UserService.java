package com.moon.springcloudconfigserver;

import com.moon.springcloudconfigserver.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList();

    public String hello() {
        return "hello...";
    }

    static {
        User user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);
        user = new User();
        user.setId("1111");
        user.setName("111111111");
        users.add(user);


    }

    public User find(String id) {
        return users.get(0);
    }

    public List<User> findAll() {
        return users;
    }
}
