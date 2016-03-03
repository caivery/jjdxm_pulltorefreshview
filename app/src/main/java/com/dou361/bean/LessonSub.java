package com.dou361.bean;

import java.io.Serializable;

public class LessonSub implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3290792072570032409L;
	String title;
	String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
