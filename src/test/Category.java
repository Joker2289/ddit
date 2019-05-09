package test;

import java.util.Scanner;

public class Category {

   static int tmp=0;
   static int num=0;
   static int menu=0;
   
   final static String[][] menu_cate = 
      {{"메인 메뉴","일반 게시판","인기 게시판","갤러리 게시판"},
      {"일반게시판","글쓰기","수정","삭제"},
      {"인기게시판","글쓰기","수정","삭제"},
      {"갤러리게시판","글쓰기","수정","삭제"}};
   

   static int go(String str) {
      
      for(int i=0; i<menu_cate.length; i++) {
         if(str.equals(menu_cate[i][0])) {
            return i;
         }
      }
      return 0;
   }

   public static void main(String[] args) {
      
      while(true) {
    	  
         //메뉴출력
         menu_view(menu);
         //메뉴입력
         int_input();
         //공통기능
         switch(num) {
         case 0 : 
            menu = go("메인 메뉴");
            break;
         }
         
         //메뉴카테고리
         switch(menu) {
         case 0 : //메인메뉴
            switch(num) {
               case 1 : 
                  menu = go("일반게시판");
                  break;
               case 2 : 
                  menu = go("인기게시판");
                  break;
               case 3 : 
                  menu = go("갤러리게시판");
                  break;
            }
            break;
            
         case 1 : //일반게시판         
            switch(num) {
               case 1:
                  System.out.println("글쓰기 동작");
                  break;
               case 2:
                  System.out.println("수정 동작");
                  break;
               case 3:
                  System.out.println("삭제 동작");
                  break;
            }
            break;   
            
         case 2 : //인기게시판         
            switch(num) {
               case 1:
                  System.out.println("글쓰기 동작");
                  break;
               case 2:
                  System.out.println("수정 동작");
                  break;
               case 3:
                  System.out.println("삭제 동작");
                  break;
            }
            break;
            
         case 3 : //갤러리게시판
            switch(num) {
               case 1:
                  System.out.println("글쓰기 동작");
                  break;
               case 2:
                  System.out.println("수정 동작");
                  break;
               case 3:
                  System.out.println("삭제 동작");
                  break;
            }
            break;
            
         }//switch end
      }//while end
   }//main end

   
   
   
   public static int int_input() {
      Scanner s = new Scanner(System.in);
      return num = s.nextInt();
   }

   
   public static void menu_view(int menu_num) {

      line(3);
      System.out.println(menu_cate[menu_num][0]);
      line(3);
      for(int i=1; i<menu_cate[menu_num].length; i++) {      
         
         System.out.println(i + ". " + menu_cate[menu_num][i]);
      }
      line(3);
      
   }
   
   public static void line(int num) {
      String style = "-";
      
      switch(num) {
      case 1:
         style = "-";
         break;
      case 2:
         style = "=";
         break;
      case 3:
         style = "■";
         break;      
      }
         
      for(int i=0; i<100; i++) {
         System.out.print(style);
      }
      System.out.println();
   }
   
   
   
   
}