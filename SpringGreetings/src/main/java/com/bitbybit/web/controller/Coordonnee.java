package com.bitbybit.web.controller;




public class Coordonnee {
	
	private double lat;
	private double lon;
	
	public Coordonnee(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	};
	
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Coordonnee other = (Coordonnee) obj;
	        if (Double.doubleToLongBits(this.lat) != Double.doubleToLongBits(other.lat)) {
	            return false;
	        }
	        if (Double.doubleToLongBits(this.lon) != Double.doubleToLongBits(other.lon)) {
	            return false;
	        }
	        return true;
	    }
	 
	    @Override
	    public int hashCode() {
	        int hash = 3;
	        hash = 53 * hash + (int) (Double.doubleToLongBits(this.lat) ^ (Double.doubleToLongBits(this.lat) >>> 32));
	        hash = 53 * hash + (int) (Double.doubleToLongBits(this.lon) ^ (Double.doubleToLongBits(this.lon)>>> 32));
	        return hash;
	    }
	
	
	
	

}
