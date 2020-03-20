package com.dbc.ubiquity.Controller;

import com.dbc.ubiquity.Config.BaseResult;
import com.dbc.ubiquity.Constant.Str;
import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Service.PUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    private PUserService pUserService;

    @PostMapping("/getUserByAccount")
    //@Cacheable(value = "user-key")
    public BaseResult<PUbiquityUserEntity> getUser(PUbiquityUserEntity userEntity) {
        PUbiquityUserEntity user = pUserService.getUserByAccount(userEntity.getAccount());
        if(user == null) return BaseResult.failWithCodeAndMsg(1, Str.ACCOUNT_ERROR);
        if (new BCryptPasswordEncoder().matches(userEntity.getPassword(), user.getPassword())){
            return BaseResult.successWithData(user);
        }else
            return BaseResult.failWithCodeAndMsg(2, Str.PWD_ERROR);
    }

    @GetMapping("/getAllUser")
    @Cacheable(value = "userList")
    public List<PUbiquityUserEntity> getAllUser(){
        return pUserService.getUserAll();
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
