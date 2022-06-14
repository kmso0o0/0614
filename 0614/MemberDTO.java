package org.java.oop;

import java.util.Date;

public class MemberDTO {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userAddr;
	private String userPhone;
	private Date day;
	
	// getters, setters
	
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public int getUserAge() {
		return this.userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	public String getUserAddr() {
		return this.userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr=userAddr;
	}
	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	public Date getDay() {
		return this.day;
	}
	public void setDay(Date day) {
		this.day=day;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userAddr=" + userAddr + ", userPhone=" + userPhone + ", day=" + day + "]";
	}
	
	
	
}
