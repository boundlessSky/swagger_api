package com.clare.control;

import com.clare.domain.Pr_user;
import com.clare.service.Pr_userService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Pr_userService userService;

    @ApiOperation(value = "sayHello", httpMethod = "GET", produces = "text/html;charset=UTF-8")
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    public String sayHello(String name){
        return "hello " + name;
    }

    @ApiOperation(value = "sayBye", httpMethod = "GET", produces = "text/html;charset=UTF-8")
    @RequestMapping(value="/bye", method=RequestMethod.GET)
    @ResponseBody
    public String sayBye(String name){
        return "good by " + name;
    }

    @ApiOperation(value = "根据id查找用户", httpMethod = "GET", produces = "application/json;charset=utf-8")
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Pr_user getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    @ApiOperation(value = "修改用户昵称", httpMethod = "PATCH", produces = "application/json;charset=utf-8")
    @RequestMapping(value="/user/{id}", method=RequestMethod.PATCH)
    @ResponseBody
    public Pr_user updateNickNameById(@PathVariable long id, @RequestBody Pr_user user){
        return userService.updateNickNameById(id, user);
    }
}
