package 클래스사용하기;

import 클래스만들기.강아지;
import 클래스만들기.전화기;

public class 내방프로젝트 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      전화기 p1 = new 전화기();
      System.out.println(p1.size);
      System.out.println(p1.speaker);
      
      p1.통화하다();
      p1.사진을찍다();
      
      p1.size = 5;
      p1.speaker = "바나나사";
      p1.통화하다();
      
      전화기 p2 = new 전화기();
      System.out.println(p2.size);
      System.out.println(p2.speaker);

      p2.size= 9;
      p2.speaker = "멜론사";
      p2.사진을찍다();
      
      강아지 dog = new 강아지();
      dog.color="황색";
      dog.field="진돗개";
      dog.꼬리를흔들다();
      
      System.out.println(dog.color);
      System.out.println(dog.field);
   }

}