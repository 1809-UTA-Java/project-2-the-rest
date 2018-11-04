package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cheese")
public class Cheese {

	@Id
	int Id;
	String Name;
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

	@Override
	public String toString() {
		return "Cheese [Id=" + Id + ", Name=" + Name + ", Quantity=" + Quantity + "]";
	}

}