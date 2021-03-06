package com.projekat.demo.dto;

import com.projekat.demo.entity.Folder;

public class FolderDTO {
	
	private Integer id; 
	private String name;
	//veze izmedju beanova 
	
	public FolderDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public FolderDTO(Folder folder) {
		this(folder.getId(), folder.getName());
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
