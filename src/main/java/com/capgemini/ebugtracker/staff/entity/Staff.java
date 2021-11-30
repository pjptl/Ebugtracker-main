package com.capgemini.ebugtracker.staff.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.capgemini.ebugtracker.bugs.entity.Bugs;
@Entity
public class Staff {

	
	private String Fname;
	private String Lname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long staffid;
	private String username;
	private String emailid;
	private String password;
	@OneToMany(targetEntity = Bugs.class,cascade = CascadeType.ALL)
	@JoinColumn(name="Assined_Bugs",referencedColumnName = "staffid")
	private List<Bugs> bugs;	
	
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public Long getStaffid() {
		return staffid;
	}

	public void setStaffid(Long staffid) {
		this.staffid = staffid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Bugs> getBugs() {
		return bugs;
	}

	public void setBugs(List<Bugs> bugs) {
		this.bugs = bugs;
	}

	
	
	
	
}
