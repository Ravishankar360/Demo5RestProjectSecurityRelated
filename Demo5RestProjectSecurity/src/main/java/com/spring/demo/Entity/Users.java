package com.spring.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	private Integer userID;
	private String userName;
	private String passWord;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Integer userID, String userName, String passWord) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Users [" + (userID != null ? "userID=" + userID + ", " : "")
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (passWord != null ? "passWord=" + passWord : "") + "]";
	}

}
