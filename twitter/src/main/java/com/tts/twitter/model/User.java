package com.tts.twitter.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long id;

	@Email(message = "Please provide a valid email")
	@NotEmpty(message = "Please provide an email")
	private String email;

	@Length(min = 3, message = "Your username must have at least 3 characters")
	@Length(max = 15, message = "Your username cannot have more than 15 characters")
	@Pattern(regexp="[^\\s]+", message="Your username cannot contain spaces")
	private String username;

	@Length(min = 5, message = "Your password must have at least 5 characters")
	private String password;

	@NotEmpty(message = "Please provide your first name")
	private String firstName;

	@NotEmpty(message = "Please provide your first name")
	private String lastName;

	private int active;

	@CreationTimestamp
	private Date createdAt;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), 
    inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_follower", joinColumns = @JoinColumn(name = "user_id"), 
    inverseJoinColumns = @JoinColumn(name = "follower_id"))
	private List<User> followers;

	@ManyToMany(mappedBy="followers")
	private List<User> following;

	//JPA NEEDS EMPTY CONSTRUCTOR
	public User() {
	}

	

	public Long getId() {
		return id;
	}

	public User(Long id,
			@Email(message = "Please provide a valid email") @NotEmpty(message = "Please provide an email") String email,
			@Length(min = 3, message = "Your username must have at least 3 characters") @Length(max = 15, message = "Your username cannot have more than 15 characters") @Pattern(regexp = "[^\\s]+", message = "Your username cannot contain spaces") String username,
			@Length(min = 5, message = "Your password must have at least 5 characters") String password,
			@NotEmpty(message = "Please provide your first name") String firstName,
			@NotEmpty(message = "Please provide your first name") String lastName, int active, Date createdAt,
			Set<Role> roles, List<User> followers, List<User> following) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.createdAt = createdAt;
		this.roles = roles;
		this.followers = followers;
		this.following = following;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getActive() {
		return active;
	}
	
	public void setActive(int active) {
		this.active = active;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}
	
	@Override
	public String toString() {
		return "User [active=" + active + ", createdAt=" + createdAt + ", email=" + email + ", firstName=" + firstName
				+ ", id=" + id + ", lastName=" + lastName + ", password=" + password + ", roles=" + roles + ", username="
				+ username + "]";
	}

	
	
}
