package com.cts.example.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class BlogDto {
	@NotNull(message = "Cannot be  null")
	@Size(min=3)
	@Size(max=200)
	private String titleString;
	@NotNull(message = "Cannot be null")
	@Size(min=3)
	@Size(max=100)
	private String content;
	
	
	public BlogDto() {
	
	}
	public BlogDto(@NotNull(message = "Cannot be  null") @Size(min = 3) @Size(max = 200) String titleString,
			@NotNull(message = "Cannot be null") @Size(min = 3) @Size(max = 100) String content, long id) {
		super();
		this.titleString = titleString;
		this.content = content;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private long id;
	

}
