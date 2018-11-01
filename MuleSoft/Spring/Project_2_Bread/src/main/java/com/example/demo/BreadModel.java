package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BREADS")
public class BreadModel {
	
	@Id
	protected int id;

	protected int calories, stock;
	
	protected String type;
	
	@Override
	public String toString() {
		return "BreadModel [id=" + id + ", calories=" + calories + ", stock=" + stock + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
