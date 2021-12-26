package com.example.shop.web;

import com.example.shop.domain.User;
import com.example.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户信息")
@RestController
@RequestMapping(value = "/test")
@CrossOrigin
public class TestController {
    @Autowired
    private  UserService userService;

    @ApiOperation(value = "查询所有用户信息",notes = "查询所有用户信息")
    @GetMapping("/getUserAll")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> getUserAll() {
        List<User> userList = this.userService.getAll();
        for (User user:userList) {
            System.out.println("userid:"+user.getUserId()+"/username:"+user.getUserName());
        }
        return userList;
    }
}
