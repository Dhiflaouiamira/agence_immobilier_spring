package com.tekup.AgenceImmobilier.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "username", nullable = false)
	private String userName;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(long id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
}
