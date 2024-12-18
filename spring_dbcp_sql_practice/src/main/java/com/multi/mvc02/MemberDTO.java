package com.multi.mvc02;

public class MemberDTO {
	
	private int numb;
	private String id;
	private int pw;
	private String name;
	private int age;
	private String gender;
	
	public int getNumb() {
		return numb;
	}
	public void setNumb(int numb) {
		this.numb = numb;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [numb=" + numb + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}  
	

}
