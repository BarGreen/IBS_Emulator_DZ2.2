package ru.compas.logic;

import java.util.HashMap;

public class Compas {

	private String north;
	private String north_west;
	private String north_east;
	private String south;
	private String south_west;
	private String south_east;
	private String west;
	private String east;
	
	public Compas() {
		super();
	}
	
	public Compas(String north, String north_west, String north_east, String south, String south_west,
			String south_east, String west, String east) {
		super();
		this.north = north;
		this.north_west = north_west;
		this.north_east = north_east;
		this.south = south;
		this.south_west = south_west;
		this.south_east = south_east;
		this.west = west;
		this.east = east;
	}
	
	public int getNorth() {
		
		int north_min = Integer.parseInt(north.split("-")[0]); 
		
		return north_min;
	}

	public int getNorth_west() {
		
		int north_west_min = Integer.parseInt(north_west.split("-")[0]); 
		
		return north_west_min;
	}

	public int getNorth_east() {
		
		int north_east_min = Integer.parseInt(north_east.split("-")[0]); 
		
		return north_east_min;
	}

	public int getSouth() {
		
		int south_min = Integer.parseInt(south.split("-")[0]); 
		
		return south_min;
	}

	public int getSouth_west() {
		
		int south_west_min = Integer.parseInt(south_west.split("-")[0]); 
		
		return south_west_min;
	}

	public int getSouth_east() {
		
		int south_east_min = Integer.parseInt(south_east.split("-")[0]); 
		
		return south_east_min;
	}

	public int getWest() {
		
		int west_min = Integer.parseInt(west.split("-")[0]); 
		
		return west_min;
	}

	public int getEast() {
		
		int east_min = Integer.parseInt(east.split("-")[0]); 
		
		return east_min;
	}

}
