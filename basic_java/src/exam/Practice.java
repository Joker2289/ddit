package exam;

public class Practice {

	public static void main(String[] args) {
			
		String[] name = { "정거니1", "정거니2", "정거니3", "정거니4", "정거니5"};
		String[] sub = {"이름", "국어", "수학", "영어", "과학", "총점", "평균", "석차"};
		
		int[][] score = new int[name.length][sub.length-1];
		
		//점수부여
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length-3; j++){
				score[i][j] = (int)(Math.random()*51)+50;
				score[i][4] += score[i][j];	//총점
			}
			score[i][5] = score[i][4] / (score[i].length-3);	//평균
			score[i][6]++; // 석차구하기 사전작업
		}
		
		//석차구하기 
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score.length; j++){
				if(score[i][4] < score[j][4]){
					score[i][6]++;
				}
			}
		}
		
		//선택정렬
		for(int i=0; i<score.length-1; i++){
			for(int j=i+1; j<score.length; j++){
				if(score[i][6]>score[j][6]){
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
					
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		//출력
		for(int i=0; i<sub.length; i++){
			System.out.print(sub[i] + "\t");
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++){
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}
	

}