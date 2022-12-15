//package com.bin.shop.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.bin.shop.Service.UserService;
//
//@Controller
//@RequestMapping(value="/user")
//public class UserController {
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value="/join", method = RequestMethod.POST)
//    public void UserJoin(UserVO vo)
//    {
//        userService.userJoin(vo);
//        return "home";
//    }
//
//}
