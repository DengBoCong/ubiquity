package com.dbc.ubiquity.Controller;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class UserController {
    @GetMapping("/getUser")
    @Cacheable(value = "user-key")
    public PUbiquityUserEntity getUser() {
        PUbiquityUserEntity user = new PUbiquityUserEntity();
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @GetMapping("/uid")
    String uid(HttpSession session) {
        UUID uuid = (UUID) session.getAttribute("uid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uid", uuid);
        return session.getId();
    }
}
