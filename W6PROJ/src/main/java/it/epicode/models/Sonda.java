package it.epicode.models;

public class Sonda extends Subject {
	private final int maxLevel = 5;
	
	
	public Sonda(int id, double d, double e) {
		super();
		this.id = id;
		this.lon = d;
		this.lat = e;
	}
	
	
	private int id;
	private double lon;
	private double lat;
	private int smokeLevel = 0;


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getLon() {
		return lon;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public int getSmokeLevel() {
		return smokeLevel;
	}
	
	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		
		if(smokeLevel > maxLevel) {
			super.notifyObservers();
		}
	}
	
	
}
