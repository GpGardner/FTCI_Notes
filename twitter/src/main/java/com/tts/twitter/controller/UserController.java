package com.tts.twitter.controller;

import java.util.List;

import com.tts.twitter.model.User;
import com.tts.twitter.service.TweetService;
import com.tts.twitter.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private TweetService tweetService;

	@GetMapping(value = "/users")
	public String getUsers(Model model){

		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		SetTweetCount(users, model);
		return "users";

	}
}
