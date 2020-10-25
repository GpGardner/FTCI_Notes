package com.tts.techtalentblog.BlogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
		//We do not want to create a new instance everytime,
		// instead we can pass in the blogPost as is.
		// Springboot is doing the hard work for us in the background
		blogPostRepository.save(blogPost);

		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		return "blogpost/result";
	}

	@RequestMapping(value = "/blogpost/delete/{id}")
	public String deletePostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
		blogPostRepository.deleteById(id);

		return "redirect:/";
	}

	// This is the mapping to edit a specific post
	@RequestMapping(value = "/blogpost/edit/{id}")
	public String editPostWithId(@PathVariable Long id, Model model) {
		// Use blogPostRepo to find post by id
		// It returns an Optional<T>
		// Use a variable to store the the blogPost if its there
		Optional<BlogPost> editPost = blogPostRepository.findById(id);

		// Initalize a variable to be filled by the post if it exists
		BlogPost result = null;

		// use Optional method, to check if the post came through
		if (editPost.isPresent()) {
			// if the post came through, store it in result
			result = editPost.get();
			//add attribute to page, accessible through model
			model.addAttribute("blogPost", result);
		} else {
			//Need to handle error here, you could use a html error page
			return "Error";
		}

		// Show browser the blogpost/new page
		return "blogpost/new";
	}

}
