package com.sun.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "save_point")
public class SavePoint {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_account_id")
	private int userAccountId;
	
	@Column(name = "chapter_page")
	private String chapterPage;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status_id")
	private int statusId;
	
	@Column(name = "update_time")
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public String getChapterPage() {
		return chapterPage;
	}

	public void setChapterPage(String chapterPage) {
		this.chapterPage = chapterPage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}