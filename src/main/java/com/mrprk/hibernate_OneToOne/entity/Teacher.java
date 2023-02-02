package com.mrprk.hibernate_OneToOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {

	@Id
	@Column(name = "teacher_id")
	private int teacherId;

	@Column(name = "teacher_name")
	private String teacherName;

	@Column(name = "teacher_subject")
	private String teacherSubject;

	@OneToOne
	@JoinColumn(name = "aadhar_id")
	private AadharDetails aadharDetails;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public AadharDetails getAadharDetails() {
		return aadharDetails;
	}

	public void setAadharDetails(AadharDetails aadharDetails) {
		this.aadharDetails = aadharDetails;
	}

	public Teacher(int teacherId, String teacherName, String teacherSubject, AadharDetails aadharDetails) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSubject = teacherSubject;
		this.aadharDetails = aadharDetails;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSubject=" + teacherSubject
				+ ", aadharDetails=" + aadharDetails + "]";
	}

}
