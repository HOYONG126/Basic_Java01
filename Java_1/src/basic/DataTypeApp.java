package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		/* 자료형
		 * 1. 원시형
		 * (정수형 int, 실수형 double, 문자형 char) ->연산가능, 논리형
		 * 2. 참조형(referenceType): 특정 대상을 표현하기 위한 자료형-식별자(클래스)		 
		 * => String 클래스 : 문자열을 표현하기 위한 자료형(클래스)
		 */
		//리터럴 : 프로그램에서 값을 표현
		System.out.print("정수형 : ");
		int nData;
		nData=40;
		System.out.println(nData);
		
		System.out.print("실수형 : ");
		double dData;
		dData=4.555;
		System.out.println(dData);
		
		System.out.print("문자형 : ");
		char cData;
		cData='A';
		System.out.println(cData);
		
		System.out.print("boolean 형 : ");
		boolean isChecked=true;
		System.out.println(isChecked);
		
		System.out.println("=========================================");
		
		System.out.println(2+0+2+3+"은 토끼띠입니다.");  //의도에 반한 오류
		System.out.println(""+2+0+2+3+"은 토끼띠입니다.");  //의도에 반한 오류를 수정 //NullString
		System.out.println("올해는"+2+0+2+3+"년입니다.");
		
		System.out.println("=========================================");
		int num1=100,num2=200;
		System.out.println("연산결과="+num1+num2);  //의도에 반한 오류
		System.out.println("연산결과="+(num1+num2));//의도에 반한 오류를 수정 //괄호사용
		System.out.println("연산결과="+num1*num2);//사칙연산 순서적용 //그래도 곱하기여도 괄호사용하자
		
		
	}

}