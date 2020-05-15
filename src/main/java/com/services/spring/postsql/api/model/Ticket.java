package com.services.spring.postsql.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="ticket")

public class Ticket 
{
	@Id
	@GeneratedValue
	private int id;
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", mobile=" + mobile + ", name=" + name + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String  mobile;
	private String name ;

}
