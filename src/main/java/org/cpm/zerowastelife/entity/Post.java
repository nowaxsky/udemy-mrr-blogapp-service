package org.cpm.zerowastelife.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_UMBS_POST")
public class Post implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9101425807364302159L;

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="categories")
	private String categories;
	
	@Column(name="content")
	private String content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
