package basic;

public class OperatorApp {
	public static void main(String[] args) {
		// 연산자(Operator): 계산을 목적으로 제공되는 기호 또는 키워드
		// 피연산자: 연산자에 의해 계산되는 것을 의미
		// 단항연산자(피연산자:1개), 이항연산자(피연산자:2개),삼항연산자(피연산자:3개)

		// 최우선 연산자 : 무조건 가자 먼저 연산 처리되는 연산자
		// => ():우선 처리 연산자, []배열연산자 객체연산자..
		System.out.println("10+20*3");
		System.out.println("(10+20)*3");

		// 단항연산자(피연산자 1개)
		// + : 양수화
		// - : 음수화
		// ! : not연산자 => false true 생성용도
		int a1 = 10;
		System.out.println("a1 = " + a1);
		System.out.println("a1 = " + -a1);
		System.out.println(!(20 > 10));
		System.out.println(!(20 < 10));
		System.out.println("==============================================");
		// ++:1증가 연산자
		// --:1감소 연산자
		int a2 = 10, a3 = 10;
		System.out.println("a2 : " + a2 + "  a3 : " + a3);
		++a2;
		--a3;
		System.out.println("a2 : " + a2 + "  a3 : " + a3);
		a2 = 10;
		a3 = 10;
		System.out.println(++a2); // 앞에 붙으면 그 수부터 +1
		System.out.println(a2++); // 뒤에 붙으면 그 줄까지 하고 +1
		int a4 = 10;
		int result = a4++; // 담는건 연산되지않고 모양그대로
		int result2 = result;
		System.out.println(result2); // 뒤에 붙으면 그 줄까지 하고 +1
		// 강제 형변환 연산자

		// 비교(관계) 연산자 true, false 출력
		// > , < , <= , >= , == , !=
		System.out.println("20>10:" + (20 > 10));

		// 일반 논리 연산자: 두개의 비교 연산식을 연결하기 위한 연산자 &&(and), ||(or)
		// 삼항연산자 : 조건식 ? 참값 : 거짓값
		int aaa = 10;
		System.out.println(aaa + "" + (aaa % 2 == 0 ? "짝수" : "홀수"));

		// 대입연산자 : 왼쪽 피연산자(변수)에 값을 저장하기 위한 연산자
		// => 무조건 마지막에 실행됨
		// => 순수 대입 연산자 : 변수에 값을 저장 =
		// => 계산 대입 연산자 : 변수에 저장된 값을 계산한 후에 변수에 다시 저장
		// -=,+=,*=,/=,%=
		int e = 10;
		e += 10;
		System.out.println(e);
		e = 10;
		e -= 10;
		System.out.println(e);
		e = 10;
		e *= 10;
		System.out.println(e);

	}
}
