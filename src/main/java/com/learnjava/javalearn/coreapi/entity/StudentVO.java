package com.learnjava.javalearn.coreapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentVO {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
    private Long studentId;
     
    @Column(name="student_name")
    private String studentName;

    @Column(name="student_dob")
    private String studentDob;
    
    @Column(name="student_admission_id")
    private Long studentAdmissionId;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}

	public Long getStudentAdmissionId() {
		return studentAdmissionId;
	}

	public void setStudentAdmissionId(Long studentAdmissionId) {
		this.studentAdmissionId = studentAdmissionId;
	}
}
