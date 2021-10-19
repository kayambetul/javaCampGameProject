package Entities;

public class Game {
	//FÝELD
	private int id;
	private String gameName;
	private double gamePrice;
	
	//YAPICILAR
	public Game() {
		
	}
	public Game(int id, String gameName, double gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	
	//SET/GET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	

}
