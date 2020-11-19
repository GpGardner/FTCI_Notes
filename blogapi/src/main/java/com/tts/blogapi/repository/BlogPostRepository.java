package com.tts.blogapi.repository;

import com.tts.blogapi.models.BlogPost;

import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
	
}
