package com.hcl.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User1 {
	//@SuppressWarnings("deprecation")
		@NotEmpty
		@Size(min=4,max=12)
		private String name;
		@NotEmpty
		private String password;
		

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
		
		public String toString() {
			return "User [name=" + name + ", Password=" + password+ "]";
		}

}
