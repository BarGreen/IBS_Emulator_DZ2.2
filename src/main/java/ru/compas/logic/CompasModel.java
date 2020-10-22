package ru.compas.logic;

import java.io.Serializable;



public class CompasModel implements Serializable {
	
	private static final CompasModel instance = new CompasModel(); 
	
	Compas compas = new Compas();

	public static CompasModel getInstance() {
		return instance;
	}
	
	public String roza_vetrov(int degree) {
		
		if (degree >= compas.getNorth() && degree <= compas.getNorth_east()) {
			return "North";
		} else if (degree >= compas.getNorth_east() && degree <= compas.getEast()) {
			return "North-East";
		} else if (degree >= compas.getEast() && degree <= compas.getSouth_east()) {
			return "East";
		} else if (degree >= compas.getSouth_east() && degree <= compas.getSouth()) {
			return "South-East";
		} else if (degree >= compas.getSouth() && degree <= compas.getSouth_west()) {
			return "South";
		} else if (degree >= compas.getSouth_west() && degree <= compas.getWest()) {
			return "South-West";
		} else if (degree >= compas.getWest() && degree <= compas.getNorth_west()) {
			return "West";
		} else if (degree >= compas.getNorth_west() && degree <= 360) {
			return "North-West";
		} else {
			return "ERROR";
		}
		
	}
	
}
