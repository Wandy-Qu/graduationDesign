package com.goo.data;

import java.util.ArrayList;
import java.util.List;

public class Player {
	int id;
	String name;
	List<Poker> playerPokers = new ArrayList<Poker>();
	public Player(int id, String name) {
		this.id = id;
		this.name = name;

	}
	public List<Poker> getPlayerPokers() {
		return playerPokers;
	}

	public void setPlayerPokers(List<Poker> playerPokers) {
		this.playerPokers = playerPokers;
	}

	public int getID() {
		return id;
	}

	public void setID(int ID) {
		this.id = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
