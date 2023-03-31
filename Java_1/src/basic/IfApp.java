package basic;

public class IfApp {
	public static void main(String[] args) {
		// 제어문(Control Statement)->프로그램흐름thread를 바꿔주는 명령
		// => 선택문(if, switch), 반복문(for, while), 기타(break, continue, return)
		/*
		 * -if 조건식에 의해 명령 선택실행 if(조건식){명령; 명령; ... } 조건식 통과후 명령이 하나만 작성된 경우에만 블럭{}기호 생략
		 * 가능 else if(조건식){명령; 명령;...} 생략가능 else 생략가능
		 */
		int su = 90;
		if (su >= 90) {
			System.out.println("su = " + su);
		}
		if (su >= 90)
			System.out.println("su = " + su);
		System.out.println("================================================");
		// if 조건식 틀릴때 출력방법
		int score = 80;
		if (score >= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		int num = 9;
		System.out.println("================================================");
		// 변수값을 홀수와 짝수로 구분하여 출력
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else
			System.out.println("홀수");
		System.out.println("================================================");
		// 문자변수에 저장된 문자값을 영문자와 비영문자로 구분하여 출력하는 프로그램 작성
		char mun = '0';
		// char mun2='ㅇ';
		if (mun >= 'A' && mun <= 'Z' || mun >= 'a' && mun <= 'z') {
			System.out.println("영문자 입니다.");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		System.out.println("================================================");
		// boolean형이 조건 안으로 들어갈 수 있다.
		boolean sw = true;
		if (sw) {
			System.out.println("현재 변수값은 \'참\'입니다. ");
		} else {
			System.out.println("현재 변수값은 \'거짓\' 입니다.");
		}
		System.out.println("================================================");
		// 학점 90~ :A , 80~:B , 70~:C ,60~:D,~50:F
		String grade = ""; // 학점 저장
		int jumsu = 95;
		if (jumsu >= 0 && 100 >= jumsu) {
			if (jumsu >= 90) {
				grade = "A";
			} else if (jumsu >= 80) {
				grade = "B";
			} else if (jumsu >= 70) {
				grade = "C";
			} else if (jumsu >= 60) {
				grade = "D";
			} else if (jumsu < 60) {
				grade = "F";
			}
			System.out.println("학점은 : " + grade + ", 점수는" + jumsu + "입니다.");
		} else {
			System.out.println("0~100에 맞지 않는 수 입니다.");
		}
		System.out.println("================================================");

	}
}
