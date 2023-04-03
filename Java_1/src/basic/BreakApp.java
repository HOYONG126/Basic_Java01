package basic;

public class BreakApp {
	public static void main(String[] args) {
		//break : switch 구문 또는 반복문을 강제종료하기 위한 명령
		//        +반복문 즉시 탈출
		for(int i =1; i<=5; i++) {
			System.out.println(i+"\t");
			if(i==3) {
				break;
			}
		}
		System.out.println("===================");
		//반복문 작성시 반복문을 구분하기 위한 라벨명 선언 가능
		hoyong:for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				//break 라벨명 : 라벨명으로 지정된 반복문 종료
				if(j==3) break hoyong;
				System.out.println("i = "+i+"  j = "+j);
			}
		}
	}
}
