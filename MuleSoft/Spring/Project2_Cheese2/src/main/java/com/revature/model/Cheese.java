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
	
	@Column(name = "Stock")
	int Stock;

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

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	public void subStock(int amount){
		Stock -= amount;
	}

	public Cheese(int id, String name, int stock) {
		super();
		Id = id;
		Name = name;
		Stock = stock;
	}

	public Cheese() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cheese [Id=" + Id + ", Name=" + Name + ", Stock=" + Stock + "]";
	}

}