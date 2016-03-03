package com.dou361.bean;

import java.io.Serializable;
import java.util.List;

public class Lesson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1869897288124698928L;
	String title;
	String instroducation;
	List<LessonSub> list;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstroducation() {
		return instroducation;
	}

	public void setInstroducation(String instroducation) {
		this.instroducation = instroducation;
	}

	public List<LessonSub> getList() {
		return list;
	}

	public void setList(List<LessonSub> list) {
		this.list = list;
	}

}
