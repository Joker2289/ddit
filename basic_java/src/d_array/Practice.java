package d_array;

public class Practice {

	public static void main(String[] args) {
		int[][] score = new int[5][7];
		
		String[] name = {"박정권1", "박정권2", "박정권3", "박정권4", "박정권5"};
		String[] sub = {"이름", "국어", "수학", "영어", "과학", "총점", "평균", "석차"};
		//점수입력
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length-3; j++){
				score[i][j] = (int)(Math.random() * 51)+50;
				score[i][4] += score[i][j];
			}
			score[i][5] = score[i][4] / (score[i].length-3);
			score[i][6]++;	
		}
		
		//RANK
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score.length; j++){
				if(score[i][4]<score[j][4]){
					score[i][6]++;
				}
			}
		}
		
		//선택정렬
		for(int i=0; i<score.length-1; i++){
			for(int j=i+1; j<score.length; j++){
				if(score[i][6] > score[j][6]){
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
