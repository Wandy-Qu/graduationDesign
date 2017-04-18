package com.goo.data.entity;

import java.util.Date;

public class PlantEnv {
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	private int Id;
	private int fId;
	private String filed1;
	private String filed2;
	private String filed3;
	private Date createTime;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFiled1() {
		return filed1;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	public String getFiled2() {
		return filed2;
	}
	public void setFiled2(String filed2) {
		this.filed2 = filed2;
	}
	public String getFiled3() {
		return filed3;
	}
	public void setFiled3(String filed3) {
		this.filed3 = filed3;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}