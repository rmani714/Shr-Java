package com.dev.methods;

import java.sql.Date;

class Marvel{
	
	private String movieName;
	private int moviePart;
	private Date releaseDate;
	
	public Marvel() {
	}
	
	public Marvel(String movieName, int moviePart, Date releaseDate) {
		this.movieName = movieName;
		this.moviePart = moviePart;
		this.releaseDate = releaseDate;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMoviePart() {
		return moviePart;
	}
	public void setMoviePart(int moviePart) {
		this.moviePart = moviePart;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}


public class MethodExample {
	
	private void getMarvel() {
		

	}
	
	public static void main(String[] args) {
		MethodExample methodExample = new MethodExample();
		Marvel marvel = new Marvel("THOR", 1, new Date(System.currentTimeMillis()));
		methodExample.getMarvel();
		
		
		
	}

}
