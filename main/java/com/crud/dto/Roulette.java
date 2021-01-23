package com.crud.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Roulette")
public class Roulette {

	@Id
	private Long id;
	private Long active;
	private Long rouletteMoney;
	
	
	public Roulette() {
		
	}
	
	public Roulette(Long id, Long active, Long rouletteMoney) {
		super();
		this.id = id;
		this.active = active;
		this.rouletteMoney = rouletteMoney;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getActive() {
		return active;
	}


	public void setActive(Long active) {
		this.active = active;
	}


	public Long getRouletteMoney() {
		return rouletteMoney;
	}


	public void setRouletteMoney(Long rouletteMoney) {
		this.rouletteMoney = rouletteMoney;
	}
	
}
