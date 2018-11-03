package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BREADS")
public class Bread {
	@Override
	public String toString() {
		return "Bread [id=" + id + ", type=" + type + ", calories=" + calories + ", Stock=" + Stock + "]";
	}

	public Bread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bread(int id, String type, int calories, int stock) {
		super();
		this.id = id;
		this.type = type;
		this.calories = calories;
		Stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock() {
		Stock -= 1;
	}
	
	public void restockStock() {
		Stock = 10 ;
	}

	@Id
	//@GeneratedValue
	@Column(name="ID")
	int id;
	
	@Column(name="TYPE")
	String type;
	
	@Column(name="CALORIES")
	int calories;
	
	@Column(name="STOCK")
	int Stock;
	
}
