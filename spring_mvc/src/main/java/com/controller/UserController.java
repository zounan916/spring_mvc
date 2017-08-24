package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@ResponseBody
	@RequestMapping({"user"})
	public String UserGet(){
		System.out.println("yes coming ... ");
		List<User> list = userServiceImpl.getUsers();
		System.out.println(list.size());
		for(User user : list)
			System.out.println(user);
		return "OK";
	}
}
