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
		System.out.println("정수형");
		int nData;
		nData=40;
		System.out.println(nData);
		
		System.out.println("실수형");
		double dData;
		dData=4.555;
		System.out.println(dData);
		
		System.out.println("문자형");
		char cData;
		cData='A';
		System.out.println(cData);
		
		System.out.println("boolean 형");
		boolean isChecked=true;
		System.out.println(isChecked);
		
		int tempData=12;
		tempData=7;           //바뀜
		tempData=3;
		System.out.println(tempData); //가장 마지막에 설정한 데이터만 저장된다.
		//int tempData=120; //중복설정 불가능 >> 변수명은 고유(유일)해야한다.
		
		
	}

}
