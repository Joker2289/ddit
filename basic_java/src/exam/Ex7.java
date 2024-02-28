package exam;

public class Ex7 {

	public static void main(String[] args) {
/*		[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
		다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
		가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
		어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
*/
//		[연습문제]/ch7/Exercise7_1.java
		
			/*class SutdaDeck {
			final int CARD_NUM = 20;
			SutdaCard[] cards = new SutdaCard[CARD_NUM];
			SutdaDeck() {
			
			for(int i = 1; i<cards.length+1; i++){
				boolean tf = false;
				if(i==3 || i==1 || i==8){
					tf = true;
				}
				cards[i-1] = new SutdaCard(i<=10 ? i : i-10, tf );
			}
			
			
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
			// info()대신 Object클래스의 toString()을 오버라이딩했다.
			public String toString() {
			return num + ( isKwang ? "K":"");
			}
			}
			class Exercise7_1 {
			public static void main(String args[]) {
			SutdaDeck deck = new SutdaDeck();
			for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
			}
			}*/
		
		/*[7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
			[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
				1. 메서드명 : shuffle
					기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
					반환타입 : 없음
					매개변수 : 없음
					
				void shuffle(){
					for(int i=0; i < cards.length; i++){
						int tmp = (int)(Math.random() * 20);
						SutdaCard tmp2 = cards[i];
						cards[i] = cards[tmp];
						cards[tmp] = tmp2;
					}
				}
					
				2. 메서드명 : pick
					기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
					반환타입 : SutdaCard
					매개변수 : int index - 위치
					
					SutdaCard pick(int index){
						return cards[index];
					}
					
				3. 메서드명 : pick
					기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
					반환타입 : SutdaCard
					매개변수 : 없음
				
					SutdaCard pick(){
						int index = (int)(Math.random()*20);
						return cards[index];
					}*/
					
		//[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		
		//답) 정의 : 상속받은 조상클래스의 메서드의 내용을 변경하는것
		// 	필요성 : 이미 정의된 메서드를 필요에 따라 수정하여 코드의 중복성을 줄일 수 있다 
		
		/*	[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
				a. 조상의 메서드와 이름이 같아야 한다.
				b. 매개변수의 수와 타입이 모두 같아야 한다.
				c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
				d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.*/
		
		// 		답 : c, d
		
		
		/*[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
		위해서는 코드를 어떻게 바꾸어야 하는가?*/
		
		/*연습문제]/ch7/Exercise7_5.java
		class Product{
			int price; // 제품의 가격
			int bonusPoint; // 제품구매 시 제공하는 보너스점수
			Product(int price) {
				this.price = price;
				bonusPoint =(int)(price/10.0);
			}
		}
		
		class Tv extends Product {
			Tv(Product p) {
				
				답) super(8);
			
			}
			public String toString() {
				return "Tv";
			}
		}
		
		class Exercise7_5 {
			public static void main(String[] args) {
				Tv t = new Tv();
			}
		}*/
		
		
		
		//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
		
		//답)
		
		
		
		//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		
		/*[연습문제]/ch7/Exercise7_7.java
			class Parent {
				int x=100;
				
				Parent() {
					this(200);
				}
				
				Parent(int x) {
					this.x = x;
				}
				
				int getX() {
					return x;
				}
			}
			
			class Child extends Parent {
				int x = 3000;
				Child() {
					this(1000);
				}
				
				Child(int x) {
					this.x = x;
				}
			}
		class Exercise7_7 {
			public static void main(String[] args) {
				Child c = new Child();
				System.out.println("x="+c.getX());
			}
		}*/
		
		/*[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?
				a. public-protected-(default)-private
				b. public-(default)-protected-private
				c. (default)-public-protected-private
				d. private-protected-(default)-public*/
		
		// 답) a. public-protected-(default)-private
		
		/*[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
			옳지 않은 것은? (모두 고르시오)
				a. 지역변수 - 값을 변경할 수 없다.
				b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
				c. 메서드 - 오버로딩을 할 수 없다.
				d. 멤버변수 - 값을 변경할 수 없다.*/
		
		//답) a
		
		
		/*[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		getter와 setter메서드를 추가하라.*/
		
		/*[연습문제]/ch7/Exercise7_10.java
			class MyTv2 {
				boolean isPowerOn;
				int channel;
				int volume;
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
				
				답)
				public void power(){
					isPowerOn = !isPowerOn;
				}
				
				public int getChannel(){
					return channel;
				}
				
				public void setChannel(int num){
					if(MAX_CHANNEL >= num || MIN_CHANNEL >= num)
					this.channel = num;
					
				}
			
				public int getVolume(){
					return volume;
				}
				
				public void setVolume(int num){
					if(MAX_VOLUME >= num || MIN_VOLUME >= num)
					this.volume = num;
				}
			}
			class Exercise7_10 {
				public static void main(String args[]) {
					MyTv2 t = new MyTv2();
					t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setVolume(20);
					System.out.println("VOL:"+t.getVolume());
				}
			
			}
			[실행결과]
				CH:10
				VOL:20*/
		
	/*	[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
			기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
			[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
			메서드명 : gotoPrevChannel
			기 능 : 현재 채널을 이전 채널로 변경한다.
			반환타입 : 없음
			매개변수 : 없음*/
		
		/*[연습문제]/ch7/Exercise7_11.java
			class MyTv2 {
			
				private	boolean isPowerOn;
				private int channel;
				private int volume;
				int channel2;
				
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
			
			
				public void power(){
					isPowerOn = !isPowerOn;
				}
				
				public int getChannel(){
					return channel;
				}
				
				public void setChannel(int num){
					if(MAX_CHANNEL >= num && MIN_CHANNEL <= num){
						this.channel2 = this.channel;
						this.channel = num;
					}
				}
			
				public int getVolume(){
					return volume;
				}
				
				public void setVolume(int num){
					if(MAX_VOLUME >= num && MIN_VOLUME <= num)
					this.volume = num;
				}
				
				public void gotoPrevChannel(){
					setChannel(this.channel2);
				}
			 
			}
			class Exercise7_11 {
				public static void main(String args[]) {
					MyTv2 t = new MyTv2();
					t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setChannel(20);
					System.out.println("CH:"+t.getChannel());
					t.gotoPrevChannel();
					System.out.println("CH:"+t.getChannel());
					t.gotoPrevChannel();
					System.out.println("CH:"+t.getChannel());
				}
			}*/
	
		/*[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. public은 접근제한이 전혀 없는 접근 제어자이다.
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
			c. 지역변수에도 접근 제어자를 사용할 수 있다.
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.*/
		
			//답) c
		
		//[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?

		
		
		
		/*[7-14] 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
		변경되어서는 안 되는 값이다. 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이
		될 수 도 있기 때문이다. 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.*/
		
		/*[연습문제]/ch7/Exercise7_14.java
			class SutdaCard {
				final int num;
				final boolean isKwang;
				SutdaCard() {
					this(1, true);
				}
				SutdaCard(int num, boolean isKwang) {
					this.num = num;
					this.isKwang = isKwang;
				}
				public String toString() {
					return num + ( isKwang ? "K":"");
				}
			}
			class Exercise7_14 {
				public static void main(String args[]) {
					SutdaCard card = new SutdaCard(1, true);
				}
			}*/
		
		/*[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
				(모두 고르시오.)
				
				class Unit {}
				class AirUnit extends Unit {}
				class GroundUnit extends Unit {}
				class Tank extends GroundUnit {}
				class AirCraft extends AirUnit {}
				Unit u = new GroundUnit();
				Tank t = new Tank();
				AirCraft ac = new AirCraft();
		
		
				(보기)
				a. u = (Unit)ac;
				b. u = ac;
				c. GroundUnit gu = (GroundUnit)u;
				d. AirUnit au = ac;
				e. t = (Tank)u;
				f. GroundUnit gu = t;*/
		
		
		//답) 
		
		
	}
}
