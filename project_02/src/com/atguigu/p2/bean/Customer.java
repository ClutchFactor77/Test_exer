package com.atguigu.p2.bean;

/**
 * @Description Customer为对象实体。用来封装客户信息
 * @author ZHAOLELE
 * @date
 */
public class Customer {
	private String name;// 姓名
	private char gender;// 性别
	private int age;// 年龄
	private String phone;// 电话号码
	private String email;// 电子邮件

	public Customer() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

}
