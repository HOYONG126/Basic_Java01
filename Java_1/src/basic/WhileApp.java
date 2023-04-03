package basic;

public class WhileApp {
	public static void main(String[] args) {
		//while : 조건에 의해 명령을 반복 실행
		//=>반복의 횟수가 명확하지 않은 경우 사용하는 반복문
		//형식) while(조건식){ 명령; 명령; ... }
		// => 조건식의 결과가 참인 경우 명령을 반복 실행하고 거짓인 경우 반복문 종료
		// => 조건식 생략 불가능
		// => 블럭 내부에 작성된 명령을 0번 이상 실행
		
		//형식) do {명령; 명령; ...} while(조건식);                 ->do일단 한번 실행하고 while 조건에 맞춰서 재반복
		int i=1;
		while(i<=5) {
			System.out.println("java");
			i++;
		}
		System.out.println("==============================================");
		int a=1;
		int n=0;
		while(a*2*n<=500) {
			n++;
		}
		System.out.println(n+"번째 접었을 때 사각형은 500개가 넘는다.("+a*2*n+"개)");
		//1~X 범위의 정수들의 합계가 300이상이 만들어지려면 X가 얼마인지 계산하여 출력하는 프로그램 작성
		int sum=0;
		int number=1;
		while(sum<=300) {
			sum+=number;
			number++;
		}
		System.out.println(number+"번째 일 때 300을 초과하고 초과한 값은 : "+sum+"이다.");
}
}

