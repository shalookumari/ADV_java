package com.ltts.Servlet.model;

public class Auction {
	private int auctionId;
	private int playerID;
	private int teamId;
	private String ayear;
	private double price;
	
	public Auction() {
		super();
	}
	public Auction(int auctionId, int playerID, int teamId, String ayear2, double price) {
		super();
		this.auctionId = auctionId;
		this.playerID = playerID;
		this.teamId = teamId;
		this.ayear = ayear2;
		this.price = price;
	}
	
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getAyear() {
		return ayear;
	}
	public void setAyear(String ayear) {
		this.ayear = ayear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", playerID=" + playerID + ", teamId=" + teamId + ", year=" + ayear
				+ ", price=" + price + "]";
	}
	public int getAuctionId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setAuctionId(int id) {
		// TODO Auto-generated method stub
		
	}
}