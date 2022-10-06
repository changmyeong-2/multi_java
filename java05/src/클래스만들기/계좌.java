package 클래스만들기;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	public  void 입금하다() {
		// TODO Auto-generated method stub
		System.out.println(이름 + "이 " + 금액 + "원을 입금하다.");
	
	}
	
	public void 출금하다() {
		System.out.println(이름 + "이 " + 계좌이름 + "에서 출금하다.");
	}
	public void 계좌신설() {
		System.out.println("성함과 계좌이름을 입력하세요");
	}
	
}
