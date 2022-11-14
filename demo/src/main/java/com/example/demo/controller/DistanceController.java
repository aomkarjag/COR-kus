package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ChainDistance;
import com.example.demo.model.UnitModel;
import com.example.demo.service.FootHandlerService;
import com.example.demo.service.MileHandlerService;
import com.example.demo.service.YardHandlerService;

@RequestMapping("api/v1/distance")
@RestController
public class DistanceController {
	private MileHandlerService handlerService;
	
	private ChainDistance c1;
	
	public DistanceController() {
		this.c1=new MileHandlerService();
		ChainDistance c2=new YardHandlerService();
		ChainDistance c3=new FootHandlerService();
		
		c1.setNextUnit(c2);
		c2.setNextUnit(c3);	
	}
	
	
	@PostMapping
	public double convertKilometer(@RequestBody UnitModel units) {
		DistanceController dist=new DistanceController();
		double value=dist.c1.calculate(units);
		return value;
	}
	
	
}
