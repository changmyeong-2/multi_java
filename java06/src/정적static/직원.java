package 정적static;

public class 직원 {
	
	String name;
	int age;
	String gen;
	static int count;
	static int totalAge;
	
	public 직원(String name, int age, String gen) {
		count++;
		this.name = name;
		this.age = age;
		this.gen = gen;
		totalAge =+ age;
	}

	public double getAve() {
		return totalAge / (double)count;
	}
	
	@Override
	public String toString() {
		return "직원 [이름은 =" + name + ", 나이는 =" + age + ", 성별은 =" + gen + "]";
	}
	
	
	
}
