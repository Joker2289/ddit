package i_collection;

import java.util.ArrayList;

public class homework {

	public static void main(String[] args) {
		
		ArrayList<String> sub = new ArrayList<String>();
		
		String[] sub1 = {"이름", "JAVA", "Oracle", "HTML", "JQuery", "JSP", "총점", "평균", "석차"};
		//제목 삽입
		for(int i = 0; i < sub1.length; i++){
			sub.add(sub1[i]);
		}
		
		ArrayList<String> name = new ArrayList<String>();
		
		String[] name1 = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기",
				"김현지", "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호",
				"윤한수", "이대용", "이준호", "이한화", "임재우", "장구현", "진민규",
				"하준용",	"한상호", "황수정"};
		//name 삽입
		for(int i = 0; i < name1.length; i++){
			name.add(name1[i]);
		}
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<ArrayList<Integer>>();
		
		//방생성
		/*for(int i=0; i<name.size(); i++){
			score.add(new ArrayList<Integer>());
		}*/
		
		
		//점수부여
		for(int i=0; i<name.size(); i++){
			score.add(new ArrayList<Integer>());	//방생성
			int sum=0;	//총점를 저장할 변수
			int avg=0;	//평균을 저장할 변수
			for(int j=0; j<sub1.length-4; j++){
				int tmp = (int)(Math.random()*51)+50;
				score.get(i).add(tmp); 
				sum += tmp;
			}
			score.get(i).add(sum);	//총점
			avg = sum / (sub.size()-4);
			score.get(i).add(avg);	//평균
		}
		
		// rank
		for(int i = 0; i<score.size(); i++){
			int rank = 1;
			for(int j = 0; j<score.size(); j++){
				if(score.get(i).get(5)<score.get(j).get(5)){
					rank += 1;
				}	
			}
			score.get(i).add(rank);
		}
		
		
		// 선택정렬
		for(int i = 0; i < score.size() - 1; i++){		//  맨 마지막수는 비교를 안하기 때문에 -1
			for(int j = i + 1; j < score.size(); j++){	// 처음수 다음수부터 비교해야해서 i + 1
				if(score.get(i).get(7) > score.get(j).get(7)){			// 석차인 7열 값 끼리 비교
					
					ArrayList<Integer> tmp = score.get(i);// int 배열 생성 i행 값 저장
					score.set(i, score.get(j));
					score.set(j, tmp);
					
					
					String tmp2 = name.get(i);				// 문자열인 name도 같이 변경
					name.set(i, name.get(j));
					name.set(j, tmp2);
				}
			}
		}
	
		//과목출력
		for(int i = 0; i<sub.size(); i++){				// 맨위에 과목먼저 출력
			System.out.print(sub.get(i) + "\t");	
		}
		System.out.println();
		
		//출력
		for(int i = 0; i<score.size(); i++){			
			System.out.print(name.get(i) + "\t");
			for(int j = 0; j<sub1.length-1; j++){
				System.out.print(score.get(i).get(j) + "\t");
			}
			System.out.println();
		}
			
	}
}

