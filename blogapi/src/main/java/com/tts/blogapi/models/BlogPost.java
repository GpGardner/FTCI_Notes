package com.tts.blogapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.validator.constraints.Length;

@Entity
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Length(min = 1)
	private String image;

	@Length(min = 3)
	private String title;

	@Length(min = 3)
	private String author;

	@Length(max = 2000)
	private String blogEntry;

	public BlogPost() {
	}

	public BlogPost(String image, String title, String author, String blogEntry) {
		this.image = image;
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public Long getId() {
		return Id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "BlogPost [Id=" + Id + ", author=" + author + ", blogEntry=" + blogEntry + ", image=" + image + ", title="
				+ title + "]";
	}
}
