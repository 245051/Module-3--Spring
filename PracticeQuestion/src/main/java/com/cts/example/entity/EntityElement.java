package com.cts.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.cts.example.dto.BlogDto;

@Entity
@Table(name="blog")
public class EntityElement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	public String titleString;
	public String content;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public EntityElement(long id, String titleString, String content) {
		super();
		this.id = id;
		this.titleString = titleString;
		this.content = content;
	}
	public EntityElement() {}
	
	public static EntityElement build(int i, String content2, String titleString2) {
		// TODO Auto-generated method stub
		return new EntityElement(i,content2,titleString2);
	}

}
