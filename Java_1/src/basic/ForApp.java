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
	}

}
