package org.frend.hello.controller;

import org.frend.hello.pojo.YUserEntity;
import org.frend.hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther frend
 * @createDate 2018/1/22
 * @Note:
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @RequestMapping(value = "/m1")
    @ResponseBody
    private Object loadUser(String username){
        YUserEntity userEntity = helloService.loadUserByName(username);
        if(userEntity != null){
            return userEntity;
        } else {
            return "找不到这条记录";
        }
    }
}
