package C;

import java.util.Arrays;

public class MultiDimansionalArray {

	public static void main(String[] args) {
		/*
		 * 1.다차원 배열
		 * - 배열안에 배열을 가지고 있는 형태이다.
		 * - 2차원 배열은 테이블 형태이다.
		 * 
		 */
		
		//선언방법
		int[][] numbers = new int[2][3]; // 2행 3열의 공간이 마련된다 - 각 인덱스마다 int의 기본값인 0이 저장
		int numbers2[][] = new int[][]{{1,2,3},{4,5,6}};
		int[] numbers3[] = {{1,2,3}
						  , {4,5,6}
						  , {7,8,9}};	
		
		int[][] numbers4 = new int[3][];
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10];	// 각각 다른길이의 배열을 넣어 줄수 있다
		
		numbers[0][0] = 0;
		numbers[0][1] = 1;
		numbers[0][2] = 2;
		numbers[1][0] = 10;
		numbers[1][1] = 11;
		numbers[1][2] = 12;
		
		System.out.println(numbers.length);		// 2 - int[][] numbers = new int[2][3];
		System.out.println(numbers[0].length);	// 3
		
		int[][] numbers5 = new int[5][5];
		for(int i = 0; i < numbers5.length; i++){
			for(int j = 0; j < numbers5.length; j++){
				numbers5[i][j] = 10; 			// 2차원배열의 초기화
			}
		}
		for(int[] numArr : numbers5){
			for(int num : numArr){
				System.out.print(num + "\t"); 	// 향상된 for문으로 출력
			}
			System.out.println();
		}
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(numbers));	// 1차원 배열의 값을 출력해주는 것 // 주소가 나옴
		
		for(int i=0; i<numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));	// 2차원 배열의 실제값을 출력하려면 이렇게
			
		}
		
		// 향상된 for문으로 출력 
		for(int[] numberArr : numbers){		// 이차원배열안의 배열들이 numberArr에 하나씩 저장
			for(int number : numberArr){	// numberArr의 배열안의 데이터를 다시 하나씪 저장
				System.out.println(number);
			}
		}
		
		//문제1. 우리반24명 모두의 Java, Oracle, HTML, JQuery, JSP성적을 
		//50~100까지 랜덤으로 생성시키고,
		// 1-1) 이름, 성적, 총점, 평균, 석차를 출력해주세요.
		scoreRank();
		// 1-2) 석차순으로 석차, 이름, 성적, 총점, 평균을 출력해주세요
		scoreSort();
		
		
	
	}

	private static void scoreRank() {
				
		
		/*String[] name = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기",
						"김현지", "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호",
						"윤한수", "이대용", "이준호", "이한화", "임재우", "장구현", "진민규",
						"하준용",	"한상호", "황수정"};
		
		String[] sub = {"이름", "JAVA", "Oracle", "HTML", "JQuery", "JSP", "총점", "평균", "석차"};
		
		int[][] score = new int[name.length][sub.length-1];
		
		//점수 부여
		for(int i = 0; i<score.length; i++){
			for(int j = 0; j<score[i].length-3; j++){		// 마지막 총점 평균 석차 의 자리 빼놓기
				score[i][j] = (int)(Math.random()*51)+50; 	// 랜덤 점수 부여
				score[i][5] += score[i][j];					// 총점
			}
			score[i][6] = score[i][5]/(score[i].length-3);					// 평균 
			score[i][7] += 1;  								// rank +1 사전작업
		}
		
		//rank
		for(int i = 0; i<score.length; i++){
			for(int j = 0; j<score.length; j++){
				if(score[i][5]<score[j][5]){				// 총점으로 비교
					score[i][7] += 1;
				}	
			}
		}
		
		// 과목
		for(int i = 0; i<sub.length; i++){
			System.out.print(sub[i] + "\t");	
		}
		System.out.println();
		
		//출력
		for(int i = 0; i<score.length; i++){
			System.out.print(name[i]+ "\t");
			for(int j = 0; j<score[i].length; j++){
				System.out.print(score[i][j]+ "\t");
			}
			
			System.out.println();
		}*/
		
		
	}

	private static void scoreSort() {
		
		
		String[] name = {"강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기",
						"김현지", "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호",
						"윤한수", "이대용", "이준호", "이한화", "임재우", "장구현", "진민규",
						"하준용",	"한상호", "황수정"};
		
		String[] sub = {"이름", "JAVA", "Oracle", "HTML", "JQuery", "JSP", "총점", "평균", "석차"};
		
		int[][] score = new int[name.length][sub.length-1];
		
		// 점수부여
		for(int i = 0; i<score.length; i++){
			for(int j = 0; j<score[i].length-3; j++){		// 마지막 총점 평균 석차 의 자리 빼놓기
				score[i][j] = (int)(Math.random()*51)+50; 	// 랜덤으로 점수부여
				score[i][5] += score[i][j];					// 총점
			}
			score[i][6] = score[i][5]/(score[i].length-3);					// 평균
			score[i][7] += 1;								// rank 사전 작업 +1
		}
		// rank
		for(int i = 0; i<score.length; i++){
			for(int j = 0; j<score.length; j++){
				if(score[i][5]<score[j][5]){
					score[i][7] += 1;
				}	
			}
		}
		
		// 선택정렬
		for(int i = 0; i < score.length - 1; i++){		//  맨 마지막수는 비교를 안하기 때문에 -1
			for(int j = i + 1; j < score.length; j++){	// 처음수 다음수부터 비교해야해서 i + 1
				if(score[i][7] > score[j][7]){			// 석차인 7열 값 끼리 비교
					
					int[] tmp = score[i];				// int 배열 생성 i행 값 저장
					score[i] = score[j];				
					score[j] = tmp;
					
					String tmp2 = name[i];				// 문자열인 name도 같이 변경
					name[i] = name[j];
					name[j] = tmp2;
				
					}
				}
			}
		// 과목출력
		for(int i = 0; i<sub.length; i++){				// 맨위에 과목먼저 출력
			System.out.print(sub[i] + "\t");	
		}
		System.out.println();
		
		// 출력
		for(int i = 0; i<score.length; i++){			
			System.out.print(name[i]+ "\t");
			for(int j = 0; j<score[i].length; j++){
				System.out.print(score[i][j]+ "\t");
			}
			
			System.out.println();
		}
		
		
		
	}
}
