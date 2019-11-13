package com.sba.course.model;

import java.util.Date;

public class MentorCourse {
	
	private Integer id;
	private String name;
	private String mentorName;
	private String skill;
	private Date startDate;
	private Date endDate;
	private Float fee;
	private Integer rate;
	private String description;
	private Integer duration;
	private boolean disabled;
	private Date disableStartDate;
	private Date disableEndDate;
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public Date getDisableStartDate() {
		return disableStartDate;
	}
	public void setDisableStartDate(Date disableStartDate) {
		this.disableStartDate = disableStartDate;
	}
	public Date getDisableEndDate() {
		return disableEndDate;
	}
	public void setDisableEndDate(Date disableEndDate) {
		this.disableEndDate = disableEndDate;
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
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Float getFee() {
		return fee;
	}
	public void setFee(Float fee) {
		this.fee = fee;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	

}
