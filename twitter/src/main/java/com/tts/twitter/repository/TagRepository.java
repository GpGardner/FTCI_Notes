package com.tts.twitter.repository;

import com.tts.twitter.model.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	
	Tag findByPhrase(String phrase);

}
