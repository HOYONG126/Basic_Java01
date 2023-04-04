package basic;

public class MathRandomApp {
	public static void main(String[] args) {
		//Math 클래스 : 수학 관련 기능을 제공하는 클래스
		//Math.random() : 0.0보다 크거나 같고 1.0보다 작은 실수 난수값을 반환하는 메소드
		//   0.0<= 난수값 <1.0 으로표출된다. 
		for(int i=1; i<=5; i++) {
			System.out.println(i+"번째 실수 난수값 = "+Math.random());
		}
		System.out.println("========================================");
		for(int i=1; i<=5; i++) {
			//1~100까지의 난수값 
			System.out.println(i+"번째 정수 난수값 = "+(int)(Math.random()*100)+1);
		}
		System.out.println("========================================");
		//로또번호
		for(int j=1; j<=6; j++) {
			System.out.println((int)(Math.random()*45)+1);
		}
	}
}