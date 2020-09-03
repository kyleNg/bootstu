package com.kyle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kyle.model.User;
import com.kyle.service.UserService;

@RestController
//@RequestMapping(value = "/user")
public class UserController {
	@Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "/user")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @GetMapping(value = "/show")
    public ModelAndView show() {
    	return new ModelAndView("main");
    }
    @GetMapping(value = "/show2")
    public ModelAndView show2() {
    	return new ModelAndView("main2");
    }
	@ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
		
        return userService.findAllUser(pageNum,pageSize);
    }
}
