package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cheese")
public class Cheese {

	@Id
	@Column(name = "Id")
	int Id;
	
	@Column(name = "Name")
	String Name;
	
	@Column(name = "Quantity")
	int Quantity;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public Cheese(int id, String name, int quantity) {
		super();
		Id = id;
		Name = name;
		Quantity = quantity;
	}

	public Cheese() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cheese [Id=" + Id + ", Name=" + Name + ", Quantity=" + Quantity + "]";
	}

}