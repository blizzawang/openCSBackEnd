package com.example.opencs;

import com.example.opencs.model.User;
import com.example.opencs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OpenCsApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }
}
