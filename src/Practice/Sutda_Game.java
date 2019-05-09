package Practice;

import java.util.Arrays;

class SutdaDeck {	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		for(int i = 0; i<cards.length; i++){
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1||num==3||num==8);	// 광
			boolean isyeol = (i < 10) && (num==4||num==7||num==9);	// 열
			cards[i] = new SutdaCard(num, isKwang, isyeol);	
		}
		
	}
	
	void shuffle(){	// 패섞기
		for(int i=0; i < cards.length; i++){
			int tmp = (int)(Math.random() * cards.length);
			SutdaCard tmp2 = cards[i];
			cards[i] = cards[tmp];
			cards[tmp] = tmp2;
		}
	}
	
	SutdaCard pick(int num){
		
		return cards[num];
	}
	
	
	
	/*SutdaCard pick(int index){
		if(index < 0 || index >= CARD_NUM)	// 유효성 검사
			return null;
		return cards[index];
	}*/
	/*
	SutdaCard pick(){
		int index = (int)(Math.random()*cards.length);
		return cards[index];
	}*/
	
	
}//SutdaDeck 클래스 종료


class SutdaCard {
	int num;
	boolean isKwang;
	boolean isyeol;
	
	SutdaCard() {
		this(1, true, true);
	}
	SutdaCard(int num, boolean isKwang, boolean isyeol) {
		this.num = num;
		this.isKwang = isKwang;
		this.isyeol = isyeol;
	}
	
	public String toString() {
		return num + ( isKwang ? "광": isyeol ? "열" : "");
	}
	
}	

class Player {
	int money;
	SutdaCard[] player_cards = new SutdaCard[2];
	
	
	void distributing(){
		SutdaDeck deck = new SutdaDeck();
		
		
		SutdaCard palyer_cards = deck.pick(0);
		
		
		
	}
	
}

public class Sutda_Game {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		/*for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");*/
		
		deck.shuffle();
		System.out.println(Arrays.toString(deck.cards));
		
		System.out.println("나   나    : " + deck.pick(0) +" / "+ deck.pick(1));
		System.out.println("플레이어1 : " + deck.pick(2) +" / "+ deck.pick(3));
		System.out.println("플레이어2 : " + deck.pick(5) +" / "+ deck.pick(4));
		System.out.println("플레이어3 : " + deck.pick(6) +" / "+ deck.pick(7));
		
		

		
		
	}
}