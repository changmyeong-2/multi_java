package 정적static;

public class 회사창업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 22, "남");
		직원 work3 = new 직원("송길동", 30, "여");
		
		System.out.println("우리 회사 직원수는 " + work3.count + "명 입니다.");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("우리 회사 직원들의 평균 나이는 " + work3.
				getAve + "세 입니다.");
		
	}

}
