package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "meats")
public class meat {
	@Id
	@Column(name = "ID")
	int id;
	String type;
	int calories;
	int stock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeat() {
		return type;
	}
	public void setMeat(String meat) {
		this.type = meat;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getAmmount() {
		return stock;
	}
	public void setAmmount(int ammount) {
		this.stock = ammount;
	}
	public void subAmmount(int ammount) {
		this.stock -= ammount;
	}
	public void addAmmount(int ammount) {
		this.stock += ammount;
	}
	@Override
	public String toString() {
		return "meat [id=" + id + ", meat=" + type + ", calories=" + calories + ", ammount=" + stock + "]";
	}
}
