package com.zzyportals.controller;


import com.zzyportals.dataobject.UserDO;
import com.zzyportals.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 *
 * @ResponseBody把返回结果直接加入到http的响应体中,
 * 不会转发了,会直接响应JSON类型的数据
 */
//@RestController // 它组合了@Controller 和 @ResponseBody
@Controller
public class UserController {

    @Autowired
    IUserService userService;


    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/user/login")
    public String login(UserDO users, ModelMap modelMap, HttpSession session) {

        UserDO logUser = this.userService.findByLogin(users);
        System.out.println("==================");
        System.out.println(logUser);
        if (logUser != null) {
            session.setAttribute("logUser", logUser);
            System.out.println(logUser);
            return "success";

        }else {
            return "error";
        }


//        return "redirect:/emp/select"; // 默认：请求转发, templates/list.html

    }

}
