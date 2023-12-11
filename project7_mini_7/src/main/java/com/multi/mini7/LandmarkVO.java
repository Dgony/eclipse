package com.multi.mini7;

public class LandmarkVO {
	
	private String landmark_name; 
	private String landmark_info;
	private String landmark_pic;
	private int lat;
	private int lon;
	private String city;
	
	public String getLandmark_name() {
		return landmark_name;
	}
	public void setLandmark_name(String landmark_name) {
		this.landmark_name = landmark_name;
	}
	public String getLandmark_info() {
		return landmark_info;
	}
	public void setLandmark_info(String landmark_info) {
		this.landmark_info = landmark_info;
	}
	public String getLandmark_pic() {
		return landmark_pic;
	}
	public void setLandmark_pic(String landmark_pic) {
		this.landmark_pic = landmark_pic;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public int getLon() {
		return lon;
	}
	public void setLon(int lon) {
		this.lon = lon;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "LandmarkVO [landmark_name=" + landmark_name + ", landmark_info=" + landmark_info + ", landmark_pic="
				+ landmark_pic + ", lat=" + lat + ", lon=" + lon + ", city=" + city + "]";
	}

}
