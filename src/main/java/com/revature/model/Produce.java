package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCE_TYPE")
public class Produce {
	private Integer id;
	private String produceType;

	public Produce(Integer id, String produceType) {
		super();
		this.id = id;
		this.produceType = produceType;
	}

	public Produce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="ID")
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduceType() {
		return produceType;
	}

	public void setProduceType(String produceType) {
		this.produceType = produceType;
	}

	@Override
	public String toString() {
		return "Produce [id=" + id + ", produceType=" + produceType + "]";
	}

}
