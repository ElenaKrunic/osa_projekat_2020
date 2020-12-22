package com.projekat.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projekat.demo.entity.Contact;
import com.projekat.demo.entity.Photo;
import com.projekat.demo.entity.User;

public class ContactDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//atributi se isto zovu u Contact i u DTO 
	private int id; 
	private String firstName; 
	private String lastName; 
	private String displayName; 	
	private String email; 
	private String note; 
	
	private Photo photo;
	private User user;
	
	public ContactDTO(int id, String firstName, String lastName, String displayName, String email, String note,
			Photo photo, User user) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.email = email;
		this.note = note;
		this.photo = photo;
		this.user = user;
	}
	
	public ContactDTO(Contact contact) {
		this(contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getDisplayName(), contact.getEmail(), contact.getNote(), contact.getPhoto(), contact.getUser());
	}


	public ContactDTO() {
		
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ContactDTO(String email) {
		super();
		this.email= email;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	
}
