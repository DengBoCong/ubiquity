package com.dbc.ubiquity;

import com.dbc.ubiquity.Entity.Primary.User;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryPository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

@RestController
public class HelloWorld {
    @Resource
    private UserPrimaryPository userPrimaryPository;

    @GetMapping("/hello")
    public String hello(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userPrimaryPository.save(new User("a", "a","a", "a",  formattedDate));
        return "hello world";
    }

    @GetMapping("/hello1")
    public String hello1(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userPrimaryPository.save(new User("b", "b","b", "b",  formattedDate));
        return "hello world";
    }
}
