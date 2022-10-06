package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1); // 주소대신 toString이 찍힘
		System.out.println(day1.count+"일차");
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(day2.count+"일차");
		
		Day day3 = new Day("운동", 10, "피트니스");
		System.out.println(day3);
		System.out.println(day3.count+"일차");
		
		System.out.println("일과시간은 " + day3.aTime + "시간" + " 평균 일과시간은 " + day3.averTime);
	}

}
