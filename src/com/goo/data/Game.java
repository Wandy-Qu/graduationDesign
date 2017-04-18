package com.goo.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
	List<Poker> pokerList = new ArrayList<Poker>();
	List<Poker> pokerListPlayerA = new ArrayList<Poker>();
	List<Poker> pokerListPlayerB = new ArrayList<Poker>();
	
	public String po[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
			"Q", "K", "A" };
	public String su[] = { "方片", "梅花", "黑桃", "红桃" };

	public void createPoker() {
		// 创建牌
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < po.length; j++) {
				pokerList.add(new Poker(su[i], po[j]));
			}

		}
	}
	//洗牌
	public void pokerShuffle() {
		Collections.shuffle(pokerList);
	}
	//发牌
	public void dealPoker(){
		for (int i = 0; i < 52; i++) {
			if(i%2==0){
				pokerListPlayerA.add(pokerList.get(i));
			}else pokerListPlayerB.add(pokerList.get(i));
		}
	}
	

}
