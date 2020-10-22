package com.tts.techtalentblog.BlogPost;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {

	@Autowired
	private BlogPostRepository blogPostRepository;

	private List<BlogPost> posts = new ArrayList<>();

	// localhost:8080
	// Handle get request to forward slash
	@GetMapping(value = "/")
	public String index(BlogPost blogPost, Model model) {
		posts.removeAll(posts);
		for (BlogPost postFromDB : blogPostRepository.findAll()) {
			posts.add(postFromDB);
		}

		model.addAttribute("posts", posts);
		return "blogpost/index";
	}

	@GetMapping(value = "/blogpost/new")
	public String newBlog(BlogPost blogPost) {
		return "blogpost/new";
	}

	@PostMapping(value = "/blogpost")
	public String addNewBlogPost(BlogPost blogPost, Model model) {

		blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(), blogPost.getBlogEntry()));
		
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		return "blogpost/result";
	}

	@RequestMapping(value = "/blogpost/{id}")
	public String deletePostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
		blogPostRepository.deleteById(id);

		return "redirect:/blogpost/new";
	}

}
