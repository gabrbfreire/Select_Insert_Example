package com.example.accessingdatamysql;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id_user", unique = true, nullable = false)
	private Integer id_user;

	@Column(name = "password_user", unique = false, nullable = false)
	private String password_user;

	@Column(name = "email_user", unique = true, nullable = false)
	private String email_user;

	public Integer getId() {
		return id_user;
	}

	public String email_user() {
		return email_user;
	}

	public String getEmail() {
		return email_user;
	}

	public void setEmail(String email) {
		this.email_user = email;
	}

	public String getPassword_user() {
		return password_user;
	}

	public void setPassword_user(String password_user) {
		this.password_user = password_user;
	}
}
