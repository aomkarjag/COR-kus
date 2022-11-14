package com.example.demo.service;

import com.example.demo.Unit;
import com.example.demo.dao.ChainDistance;
import com.example.demo.model.UnitModel;

public class YardHandlerService implements ChainDistance {
	public ChainDistance chainNext;

	@Override
	public void setNextUnit(ChainDistance chainDistance) {
		// TODO Auto-generated method stub
		this.chainNext=chainDistance;
		
	}

	@Override
	public double calculate(UnitModel distance) {
		// TODO Auto-generated method stub
		if(distance.getUnit()==Unit.Yard) {
			double value=distance.getKilometer()*0.621371;
			return value;
		}else {
			return this.chainNext.calculate(distance);
		}
	}

}
