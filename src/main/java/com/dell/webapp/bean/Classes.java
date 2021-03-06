package com.dell.webapp.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="class")
public class Classes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Subjects subject;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Teachers teacher;
	
	public Classes() {
		super();
		
	}
	public Classes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Classes(int id) {
		super();
		this.id = id;
	}
	
	public Classes(String name) {
		super();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	public Teachers getTeacher() {
		return teacher;
	}
	public void setTeacher(Teachers teachers) {
		this.teacher = teachers;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + "]";
	}
	

}
