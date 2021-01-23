package com.crud.service;

import java.util.List;

import com.crud.dto.Roulette;

public interface IRouletteService {

	public List<Roulette> listRoutletts();
	
	public Long saveRoutlette(Roulette routlette);
	
	public Roulette findRoutletteXID(Long id);
	
	public Roulette updateRoulette(Roulette routlette);
	
	public boolean deleteRoulette(Long id);
}
