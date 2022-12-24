package com.example.mock2db;

import com.example.mock2db.entity.User;
import com.example.mock2db.service.UserService;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootTest
class Mock2dbApplicationTests {

    @Autowired
    private UserService userService;

    Faker faker = new Faker(new Locale("zh-CN"));

    //生成记录条数
    private final Integer COUNT = 10;

    @Test
    void contextLoads() {
    }

    @Test
    void list() {
        userService.list().forEach(System.out::println);
    }

    @Test
    void generate() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            User user = new User();
            user.setName(faker.name().fullName());
            user.setAge(faker.random().nextInt(18, 50));
            user.setSex(faker.bool().bool()?"男":"女");
            user.setSalary(BigDecimal.valueOf(faker.random().nextInt(2000, 5000)));
            list.add(user);
        }
        list.forEach(System.out::println);
        boolean res = userService.saveBatch(list);
        if (res) {
            System.out.println("success!");
        } else {
            System.out.println("failed!");
        }
    }

}
