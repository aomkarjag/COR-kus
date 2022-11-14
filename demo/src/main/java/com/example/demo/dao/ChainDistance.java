package com.example.demo.dao;

import com.example.demo.model.UnitModel;

public interface ChainDistance {
	void setNextUnit(ChainDistance chainDistance);
	double calculate(UnitModel distance);
}
