package i_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class homework2 {

	public static void main(String[] args) {
		
		socreSort();

	}

	 private static void socreSort() {
	      // 석차순으로 석차,이름,성적,총점,평균을 출력해주세요.
	      ArrayList<ArrayList<Object>> list1 = new ArrayList<ArrayList<Object>>();
	      // 이름 값 입력
	      for (int i = 0; i < 25; i++) {
	         list1.add(new ArrayList<Object>());
	      }
	      list1.get(0).add("강현욱");
	      list1.get(1).add("김난경");
	      list1.get(2).add("신유수");
	      list1.get(3).add("김도현");
	      list1.get(4).add("김주은");
	      list1.get(5).add("김지연");
	      list1.get(6).add("김현기");
	      list1.get(7).add("김현지");
	      list1.get(8).add("노대현");
	      list1.get(9).add("동혜원");
	      list1.get(10).add("박경훈");
	      list1.get(11).add("박선희");
	      list1.get(12).add("박정권");
	      list1.get(13).add("박지선");
	      list1.get(14).add("윤상호");
	      list1.get(15).add("윤한수");
	      list1.get(16).add("이대용");
	      list1.get(17).add("이준호");
	      list1.get(18).add("이한화");
	      list1.get(19).add("임재우");
	      list1.get(20).add("장구현");
	      list1.get(21).add("진민규");
	      list1.get(22).add("하준용");
	      list1.get(23).add("한상호");
	      list1.get(24).add("황수정");

	      // 값 저장
	      for (int i = 0; i < list1.size(); i++) {
	         double sum = 0.0;
	         double avg = 0.0;
	         for (int j = 0; j < 5; j++) {
	            int random = (int) (Math.random() * 51 + 50);
	            list1.get(i).add(random);
	            sum += random;
	         }
	         list1.get(i).add(sum); // 합계 저장
	         avg = sum / 5d;
	         list1.get(i).add(avg); // 평균저장
	      }

	      // 정렬
	      // Collections.reverse(list1.get(i).get(7));
	      for (int i = 0; i < list1.size(); i++) {
	         for (int j = i + 1; j < list1.size(); j++) {
	            if ((Double) list1.get(i).get(6) < (Double) list1.get(j).get(6)) {
	               ArrayList<Object> temp = list1.get(i);
	               list1.set(i, list1.get(j));
	               list1.set(j, temp);
	            }
	         }
	      }
	      // 석차대입
	      for (int i = 0; i < list1.size(); i++) {
	         list1.get(i).add(i + 1);
	      }
	   
	      Iterator<ArrayList<Object>> iter = list1.iterator();
	      System.out.println("이름/java/oracle/html/jquery/jsp/총점/평균/석차");      
	      while (iter.hasNext()) {
	          System.out.println(iter.next() + "\t");
	      }
	   }

}
