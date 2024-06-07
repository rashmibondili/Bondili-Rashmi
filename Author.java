package com.ey10;


import java.util.List;


public class Author {
	private String surname;
	private List<String> aadharcard;
	
	private String gender;
	private String city;
	private String mobile;
	private int age;
	private String name;
	
	

	public Author(String surname,  List<String> list, 
			String i, String city, String mobile, String string, String name, int age) {
		super();
		this.surname = surname;
		
		this.aadharcard = list;
		
		this.gender = i;
		this.city = city;
		this.mobile = mobile;
		this.age = age;
		this.name = name;
	}
	



	




	public Author(String string, List<Object> asList) {
		// TODO Auto-generated constructor stub
	}









	public Author(String surname2, List<String> asList, int i, String city2, String mobile2, String string,
			String name2) {
		// TODO Auto-generated constructor stub
	}









	public String getSurname() {
		return surname;
	}




	public void setSurname(String surname) {
		this.surname = surname;
	}




	



	public List<String> getAadharcard() {
		return aadharcard;
	}




	public void setAadharcard(List<String> aadharcard) {
		this.aadharcard = aadharcard;
	}




	




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




	

}
