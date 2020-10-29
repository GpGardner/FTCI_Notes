package com.tts.twitter.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

@Entity
public class Tweet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tweet_id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
	CascadeType.MERGE })
	@JoinTable(name = "tweet_tag", joinColumns = @JoinColumn(name = "tweet_id"),
	inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private List<Tag> tags;

	@NotEmpty(message = "Tweet cannot be empty")
	@Length(max = 280, message = "Tweet cannot have more than 280 characters")
	private String message;

	@CreationTimestamp
	private Date createdAt;

	// JPA NEEDS EMPTY CONSTRUCTOR!~!
	public Tweet() {
	}

	public Tweet(Long id, User user,
			@NotEmpty(message = "Tweet cannot be empty") @Length(max = 280, message = "Tweet cannot have more than 280 characters") String message,
			Date createdAt) {
		this.id = id;
		this.user = user;
		this.message = message;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	
	@Override
	public String toString() {
		return "Tweet [createdAt=" + createdAt + ", id=" + id + ", message=" + message + ", user=" + user + "]";
	}


	

}
