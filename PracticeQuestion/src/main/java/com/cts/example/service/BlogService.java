package com.cts.example.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.example.controller.List;
import com.cts.example.dto.BlogDto;
import com.cts.example.entity.EntityElement;
import com.cts.example.repository.BlogRepository;
@Service
public class BlogService {
	@Autowired
	BlogRepository repo;
	

	public EntityElement create(@Valid BlogDto blog) {
		EntityElement ele=EntityElement.build(0,blog.getContent(),blog.getTitleString());
		return repo.save(ele);
	}


	public java.util.List<EntityElement> fetch() {
		
		return repo.findAll();
	}


	

	

}
