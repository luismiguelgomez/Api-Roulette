package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Roulette;

public interface IRouletteDAO extends JpaRepository<Roulette, Long> {
		
	
}
