package e_oop;

public class TV {
	
	private String name;	// TV이름
	private boolean power;	// 전원상태
	private int channel;	// 채널
	private int volume; 	// 음량
	
	private final int CHANNEL_MAX;
	private final int CHANNEL_MIN;
	private final int VOLUME_MAX;
	private final int VOLUME_MIN;
	
	{
		CHANNEL_MAX = 100;
		CHANNEL_MIN = 1;
		VOLUME_MAX	= 50;
		VOLUME_MIN 	= 0;
		
	}
	
	//TV 생성자	
	TV(String name){
		this.name = name;	// 기본값 초기화
		power = false;
		channel =1;
		volume = 5;
	}
	
	//TV 상태
	void TV_state(){
	System.out.println(name + "의 상태( 전원 : " + power + " / 채널 : " + channel
						+ " / 볼륨 : " + volume + " )" );
	}
	
	//전원 변경 메서드
	void on_off(){
		power = !power;
		
		if(power){
			System.out.println("TV가 켜졌습니다");
		}else if(!power){
			System.out.println("TV가 꺼졌습니다");
		}
		TV_state();
	}
	
	//채널 입력
	void channel_num(int channel){
		if(CHANNEL_MIN <= channel && channel <= CHANNEL_MAX){
			this.channel = channel;
		}
		TV_state();
	}
	
	//채널업
	void channelup(){
		if(CHANNEL_MAX > channel){
			channel += 1; //
		}
		TV_state();
	}
	
	//채널 다운
	void channel_down(){
		if(CHANNEL_MIN < channel){
			channel -= 1; 
		}
		TV_state();
	}
	
	//볼륨 업
	void volume_up(){
		if(VOLUME_MAX > volume){
			volume ++;
		}
		TV_state();
	}
	
	//볼륨 다운
	void volume_down(){
		if(VOLUME_MIN < volume){
			volume --;
		}
		TV_state();
	}
	
	
	
	
	
}
