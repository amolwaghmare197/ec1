package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "loginDet")
public class loginDet {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", length=50, nullable=false)
    private Long ID;
	
	@Column(name="LastName", length=50)
    private String Lname;
	
	@Column(name="FirstName", length=50)
    private String Fname;
	
	@Column(name="Address", length=50)
    private String Add;
	
	@Column(name="numbePhone", length=50)
    private int number;
	
	@Column(name="Age", length=50)
    private int age;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "loginDet [ID=" + ID + ", Lname=" + Lname + ", Fname=" + Fname + ", Add=" + Add + ", number=" + number
				+ ", age=" + age + "]";
	}

	public loginDet(Long iD, String lname, String fname, String add, int number, int age) {
		super();
		ID = iD;
		Lname = lname;
		Fname = fname;
		Add = add;
		this.number = number;
		this.age = age;
	}

	public loginDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
    }