package com.goo.data;

public class Poker {
	String suit;
	String points;
	public Poker(String suit,String points){
		this.suit = suit;
		this.points = points;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	//比较
	public int comparePoker(Poker p2){
		if(Integer.getInteger(points)<Integer.getInteger(p2.getPoints())){
			return 0;
		
		}else if (Integer.getInteger(points)>Integer.getInteger(p2.getPoints())){
			return 1;
		
		}else return 2;
		
	}
	
}
