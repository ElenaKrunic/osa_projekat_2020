package com.projekat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projekat.demo.entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
	
	//public List<Photo> findAll();

	//public List<Photo> findByContact(Contact contact);
	
	//public List<Photo> findAllByContact(Contact contact);
}
