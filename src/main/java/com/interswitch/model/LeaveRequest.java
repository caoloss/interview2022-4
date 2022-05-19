package com.interswitch.model;

import java.util.Date;

public class LeaveRequest {
    
	private int id;
    private String user;
    private String desc;
    private Date startDate;
    private Date endDate;
    private boolean isDone;
    
    public LeaveRequest(int user_id, String username, String desc, Date start_date, Date end_date, boolean b) {
		// TODO Auto-generated constructor stub
    	
    	id = user_id;
    	user = username;
    	desc = desc;
    	startDate = start_date;
    	endDate = end_date;
    	isDone = b;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

//Getters, Setters, Constructors, toString, equals and hash code
    
    
} 