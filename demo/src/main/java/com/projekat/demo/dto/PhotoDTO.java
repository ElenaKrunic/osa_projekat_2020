package com.projekat.demo.dto;
 

import java.io.Serializable;

import com.projekat.demo.entity.Contact;
import com.projekat.demo.entity.Photo;

public class PhotoDTO implements Serializable{
	

	private static final long serialVersionUID = 7696981515812096529L;
	private Integer id;
	private String path;
	//veze izmedju beanova
	private Contact contact; 
	
	public PhotoDTO(Integer id, String path, Contact contact) {
		super();
		this.id = id;
		this.path = path;
		this.contact = contact; 
	} 
	
	public PhotoDTO() {
		
	}
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public PhotoDTO(Photo photo) {
		this.id= photo.getId();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}

