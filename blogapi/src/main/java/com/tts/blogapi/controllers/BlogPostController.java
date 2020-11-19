package com.tts.blogapi.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.tts.blogapi.models.BlogPost;
import com.tts.blogapi.repository.BlogPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BlogPostController {

	@Autowired
	BlogPostRepository blogPostRepository;

	@GetMapping("/posts")
	public ResponseEntity<List<BlogPost>> getAllBlogPosts() {

		// BlogPost newPost = new BlogPost("First Post", "George",
		// 		"Wow I can't believe this worked, I give all credit to my amazing teacher george");
		// blogPostRepository.save(newPost);

		List<BlogPost> blogPosts = (List<BlogPost>) blogPostRepository.findAll();
		if(blogPosts.size() < 1){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		
		return new ResponseEntity<List<BlogPost>>(blogPosts, HttpStatus.OK);
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<BlogPost> getBlogPost(@PathVariable(value = "id") Long id) {

		Optional<BlogPost> blogPost = blogPostRepository.findById(id);

		if (blogPost.isPresent()) {
			return new ResponseEntity<BlogPost>(blogPost.get(), HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@PostMapping("/posts")
	public ResponseEntity<BlogPost> createBlogPost(@RequestBody @Valid BlogPost blogPost, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		blogPostRepository.save(blogPost);
		return new ResponseEntity<BlogPost>(blogPost, HttpStatus.CREATED);

	}

	@PutMapping("/posts/{id}")
	public ResponseEntity<BlogPost> editBlogPost(@PathVariable(value = "id") Long id, @RequestBody @Valid BlogPost newBlogPost, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Optional<BlogPost> blogPost = blogPostRepository.findById(id);

		if(blogPost.isPresent()){
			BlogPost blogToEdit = blogPost.get();
			blogToEdit.setAuthor(newBlogPost.getAuthor());
			blogToEdit.setTitle(newBlogPost.getTitle());
			blogToEdit.setBlogEntry(newBlogPost.getBlogEntry());

			blogPostRepository.save(blogToEdit);

		}

		return new ResponseEntity<>(HttpStatus.ACCEPTED);

	}

	@DeleteMapping("posts/{id}")
	public ResponseEntity<Void> deleteBlogPost(@PathVariable(value = "id") Long id) {
		Optional<BlogPost> blogPostToDelete = blogPostRepository.findById(id);

		if(!blogPostToDelete.isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			blogPostRepository.deleteById(id);
		}
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}




}
