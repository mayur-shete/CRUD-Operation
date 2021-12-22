package com.task.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.task.demo.entity.User;
import com.task.demo.service.UserService;
import com.task.demo.service.UserServiceImpl;
import java.util.Optional;
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/Users")
	public User saveUser(@RequestBody User u)
	{
		return userService.saveUser(u);
	}
	
	@GetMapping("/getUserList")
	public List<User> fetchUserList()
	{
		return userService.fetchUserList();
	}
	@GetMapping("/getUser/{uId}")
	public Optional<User>findById(@PathVariable("uId")int uId)
	{
		 return userService.findById(uId);
		
	}
	@GetMapping("/logIn")
	public String userAuthenticate(@RequestBody User u)
	{
		return userService.userAuthenticate(u);
	}
	
	

}
