package com.sba.course.model;

import java.util.Date;

public class CourseMentor {

	private Integer id;
	private String name;
	private String skill;
	private Date startDate;
	private Date endDate;
	private Float fee;
	private String status;
	private String userName;
	private Float cost;
	private Float rate;
	private String description;
	private Integer duration;
	private Integer schedule;
	private boolean disabled;
	private Date disableStartDate;
	private Date disableEndDate;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getSchedule() {
		return schedule;
	}

	public void setSchedule(Integer schedule) {
		this.schedule = schedule;
	}

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
	
	

	
}
