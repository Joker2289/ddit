package test;

import java.util.Arrays;

/*[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.*/

// 실행 결과 1K,2,3K,4,5,6,7,8K,9,10,i,2,3,4,5,6,7,8,9,10,

class SutdaDeck {	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		/*for(int i = 1; i<cards.length+1; i++){
			boolean tf = false;
			if(i==3 || i==1 || i==8){
				tf = true;
			}
			cards[i-1] = new SutdaCard(i<=10 ? i : i-10, tf );
		}*/
		
		
		for(int i = 0; i<cards.length; i++){
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==3||num==1||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		
	}
	
	void shuffle(){
		for(int i=0; i < cards.length; i++){
			int tmp = (int)(Math.random() * cards.length);
			SutdaCard tmp2 = cards[i];
			cards[i] = cards[tmp];
			cards[tmp] = tmp2;
		}
	}
	
	SutdaCard pick(int index){
		if(index < 0 || index >= CARD_NUM)	// 유효성 검사
			return null;
		return cards[index];
	}
	
	SutdaCard pick(){
		int index = (int)(Math.random()*cards.length);
		return cards[index];
	}
	
}


class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

//info()대신 Object클래스의 toString()을 오버라이딩했다.
public String toString() {
	return num + ( isKwang ? "광":"");
	}
}

public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		/*for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");*/
		
		deck.shuffle();
		System.out.println(Arrays.toString(deck.cards));
		
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		
		
		
	}
}