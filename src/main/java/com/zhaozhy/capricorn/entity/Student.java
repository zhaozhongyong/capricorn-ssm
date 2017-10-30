package com.zhaozhy.capricorn.entity;

public class Student {

	private Integer stuId;
	private String stuName;
	private Integer stuAge;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "stuId:" + this.stuId + ";stuName:" + this.stuName + ";stuAge:"
				+ this.stuAge;
	}

}
