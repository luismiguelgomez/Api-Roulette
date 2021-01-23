package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IRouletteDAO;
import com.crud.dto.Roulette;

@Service
public class RouletteServiceImplement implements IRouletteService{
	
	@Autowired
	IRouletteDAO iRouletteDAO;

	@Override
	public List<Roulette> listRoutletts() {
		return iRouletteDAO.findAll();
	}

	@Override
	public Long saveRoutlette(Roulette routlette) {
		iRouletteDAO.save(routlette);

		return routlette.getId();
	}
	
	@Override
	public Roulette findRoutletteXID(Long id) {
		return iRouletteDAO.findById(id).get();
	}

	@Override
	public Roulette updateRoulette(Roulette routlette) {
		return iRouletteDAO.save(routlette);
	}

	@Override
	public boolean deleteRoulette(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
