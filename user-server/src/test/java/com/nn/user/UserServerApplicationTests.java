package com.nn.user;

import com.nn.interf.UserInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServerApplicationTests {

    @Reference
    private UserInterface userInterface;

    @Test
    void contextLoads() {
        userInterface.addMoney(1000);
    }

}
