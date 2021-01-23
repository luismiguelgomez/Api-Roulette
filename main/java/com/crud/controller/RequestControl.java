package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Roulette;
import com.crud.service.RouletteServiceImplement;

@RestController
@RequestMapping("/api")
public class RequestControl {
	
	@Autowired
	RouletteServiceImplement rouletteImp;
	
	@GetMapping("/rouletts")
	public List<Roulette> listRouletts() {
		return rouletteImp.listRoutletts();
	}
	
	@PostMapping("/rouletts")
	public Long saveRouletts(@RequestBody Roulette roulette) {
		return rouletteImp.saveRoutlette(roulette);
	}
	
	@PutMapping("/rouletts/{id}")
	public Roulette activeRouletts(@PathVariable(name = "id") Long id, @RequestBody Roulette roulette) {
		Roulette rouletteAfter = new Roulette();
		Roulette rouletteUpdated = new Roulette();
		rouletteAfter = rouletteImp.findRoutletteXID(id);
		rouletteAfter.setRouletteMoney(roulette.getRouletteMoney());
		rouletteAfter.setActive((long) 1);
		rouletteUpdated = rouletteImp.updateRoulette(rouletteAfter);
		
		return rouletteUpdated;
	}
	
}