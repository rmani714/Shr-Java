package com.dev.encapsulation;

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


public class EncapsulationExample {
	
	public static void main(String[] args) {
		Marvel marvel = new Marvel();
		marvel.setMovieName("THOR");
		marvel.setMoviePart(1);
		marvel.setReleaseDate(new Date(System.currentTimeMillis()));
		
		Marvel marvel2 = new Marvel("IRON MAN", 1, new Date(System.currentTimeMillis()));
		System.out.println("Movie Name : "+marvel.getMovieName() + " Movie Part : " + marvel.getMoviePart() + " Movie Date : "+ marvel.getReleaseDate());
		System.out.println("Movie Name : "+marvel2.getMovieName() + " Movie Part : " + marvel2.getMoviePart() + " Movie Date : "+ marvel2.getReleaseDate());
		
	}

}
