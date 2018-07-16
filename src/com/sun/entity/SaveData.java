package com.sun.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "save_data")
public class SaveData {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "user_account_id")
	private String userAccountId;
	
	@Column(name = "chapter")
	private int chapter;
	
	@Column(name = "paragraph")
	private int paragraph;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "game_parameter_id")
	private String gameParameterId;
	
	@Column(name = "update_time")
	private Date updateTime;


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(String userAccountId) {
		this.userAccountId = userAccountId;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public int getParagraph() {
		return paragraph;
	}

	public void setParagraph(int paragraph) {
		this.paragraph = paragraph;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGameParameterId() {
		return gameParameterId;
	}

	public void setGameParameterId(String gameParameterId) {
		this.gameParameterId = gameParameterId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}