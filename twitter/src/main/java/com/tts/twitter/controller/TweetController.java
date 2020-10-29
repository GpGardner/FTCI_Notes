package com.tts.twitter.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.tts.twitter.model.Tweet;
import com.tts.twitter.model.TweetDisplay;
import com.tts.twitter.model.User;
import com.tts.twitter.service.TweetService;
import com.tts.twitter.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TweetController {

	@Autowired
	private UserService userService;

	@Autowired
	private TweetService tweetService;

	@GetMapping(value = { "/tweets", "/" }) // URL
	public String getFeed(@RequestParam(value = "filter", required = false) String filter, Model model) {
		User loggedInUser = userService.getLoggedInUser();
		List<TweetDisplay> tweets = new ArrayList<>();

		// /tweets?filter=following
		
		if (filter == null) {
			filter = "all";
		}
		if (filter.equalsIgnoreCase("following")) {
			List<User> following = loggedInUser.getFollowing();
			tweets = tweetService.findAllByUsers(following);
			model.addAttribute("filter", "following");
		} else {
			tweets = tweetService.findAll();
			model.addAttribute("filter", "all");
		}
		model.addAttribute("tweetList", tweets);
		return "feed";
	}

	@GetMapping(value = "/tweets/new") // URL
	public String getTweetForm(Model model) {
		model.addAttribute("tweet", new Tweet());
		return "newTweet";
	}

	// http://localhost:8080/tweets/java
	@GetMapping(value = "/tweets/{tag}") // URL
																				// java
	public String getTweetsByTag(@PathVariable(value = "tag") String tag, Model model) {
		List<TweetDisplay> tweets = tweetService.findAllWithTag(tag);
		model.addAttribute("tweetList", tweets);
		model.addAttribute("tag", tag);
		return "taggedTweets";// HTML
	}

	@PostMapping(value = "/tweets") // URL
	public String submitTweetForm(@Valid Tweet tweet, BindingResult bindingResult, Model model) {
		User user = userService.getLoggedInUser();
		if (!bindingResult.hasErrors()) {
			tweet.setUser(user);
			tweetService.save(tweet);
			model.addAttribute("successMessage", "Tweet successfully created!");
			model.addAttribute("tweet", new Tweet());
		}
		return "newTweet"; // HTML
	}
}
