package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cheese")
public class Cheese {
	
	@Id
	@Column(name = "Id")
	int Id;
	String name;
	int stock;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getCheese() {
		return name;
	}
	public void setCheese(String cheese) {
		this.name = cheese;
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
		return "Cheese [Id=" + Id + ", name=" + name + ", stock=" + stock + "]";
	}

}
