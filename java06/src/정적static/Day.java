package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int aTime;
	static double averTime;
	
	public Day(String doing, int time, String location) {
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		aTime = aTime + time;
		averTime = aTime / count;
	}
	
	//일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다!!
	//일반메소드는 객체생성후, 호출할 수 있다.
	//평균을 객체생성과 상관없이 아무때나 구하고싶다
	//객체생성과 상관없이 기능을 정의하고 싶으면, static 으로 만들어야 한다.
	
	public double getAvg() {
		return aTime / (double)count;
	}
	
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
}
