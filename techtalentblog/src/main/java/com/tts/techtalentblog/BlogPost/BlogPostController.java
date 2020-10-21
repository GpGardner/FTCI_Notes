package com.tts.techtalentblog.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {


	//localhost:8080

	@GetMapping(value = "/")
	public String index(BlogPost blogPost) {
		return "blogpost/index";
	}





}
