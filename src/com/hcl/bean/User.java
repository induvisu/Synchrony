package com.hcl.bean;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	//@SuppressWarnings("deprecation")
	@NotEmpty
	@Size(min=4,max=12)
	private String name;
	@NotEmpty
	private String password;
	//@Range(min = 18, max = 150)
	@Min(18)
	@Max(50)
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "User [name=" + name + ", Password=" + password + ", age=" + age + "]";
	}
}


