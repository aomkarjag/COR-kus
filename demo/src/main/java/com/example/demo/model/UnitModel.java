package com.example.demo.model;

import com.example.demo.Unit;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitModel {
	public int kilometer;
	public Unit unit;
	
	public UnitModel(@JsonProperty("kilometer") int kilometer,@JsonProperty("unit") Unit unit) {
		this.kilometer=kilometer;
		this.unit=unit;
			
	}
	
	public void setUnit(Unit unit) {
		this.unit=unit;
	}
	

	public void setKilometer(int kilometer) {
		this.kilometer=kilometer;
	}
	
	public int getKilometer() {
		return this.kilometer;
	}
	
	public Unit getUnit() {
		return this.unit;
	}
}
