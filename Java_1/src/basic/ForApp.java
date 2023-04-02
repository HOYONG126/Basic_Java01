package basic;

public class ForApp {
//for: 조건에 의해 명령을 반복 실행
// => 반복의 횟수가 명확한 경우 사용하는 반복문(Loop Statement)
//형식) for(초기식; 조건식; 증감식){ 명령; 명령; ... }
// =>초기식 : 변수에 초기값을 저장하는 연산식, 증감식 : 변수값을 증가시키거나 감소시키는 연산
//반드시 ; 이용 
//초기식 -> 조건식(참) -> 블럭 내부 명령 실행 -> 증감식 -> 조건식(참)-> 블럭 내부 명령 실행->증감식 -> 조건식(거짓)
//주의) 무한루프 빠질 수 있음 >> 프로그램 강제종료
//초기식과 증감식은 , 기호를 사용하여 나열 작성 가능
//초기식, 조건식, 증감식은 생략가능 - 조건식이 생략된 경우 무조건 참.
	public static void main(String[] args) {
		//"Java Programming" 화면에 출력
		System.out.println("Java Programming");
		System.out.println("====================================");
		for(int i=1; i<=5; i++) { 
			System.out.println("Java Programming");
		}
		System.out.println("=================================");
		for(int i=1; i<=10; i+=2) {    //2씩 증가시켜도된다.
			System.out.println("Java Programming");
		}
		System.out.println("=================================");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("===================================");
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println("");
		System.out.println("===================================");
		//1~100까지 합 구하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("합은 : "+sum+"입니다.");
		System.out.println("=====================");
		//20~80까지 합 구하기
			int total = 0;
			int begin=90, end=80;
			if(begin>end) {
				System.out.println("[에러] 시작값이 종료값보다 작아야합니다.");
			//	System.exit(0); //프로그램 강제 종료 메소드 호출
			}
			for(int i=begin; i<=end; i++) {
				total+=i;
			}
			System.out.println("합은 : "+total+"입니다.");
			System.out.println("===================================");
		//시작값이 종료값보다 큰 경우 두 변수에 저장된 값을 서로 바꾸어 저장되도록 작성
			begin=10; end=0;
			if(begin>end) {
				int temp=end;
				end=begin;
				begin=temp;
			}
			sum=0;
			for(int i=begin; i<=end; i++) {
				sum+=i;
			}
			System.out.println(sum);
	}
}
