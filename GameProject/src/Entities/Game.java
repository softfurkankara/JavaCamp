package Entities;

public class Game {
	int Gameid;
	String GameName;
	double GameunitPrice;
	
	public Game(int gameid, String gameName, double gameunitPrice) {
		Gameid = gameid;
		GameName = gameName;
		GameunitPrice = gameunitPrice;
	}
	public int getGameid() {
		return Gameid;
	}
	public void setGameid(int gameid) {
		Gameid = gameid;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public double getGameunitPrice() {
		return GameunitPrice;
	}
	public void setGameunitPrice(double gameunitPrice) {
		GameunitPrice = gameunitPrice;
	}
}
