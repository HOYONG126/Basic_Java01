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
		dData=4.6655;
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
		System.out.println("연산결과="+num1*num2);//사칙연산 순서적용 but 곱하기여도 괄호사용하자(실행속도 고려)
		System.out.println("=========================================");
		int korScore=88, engScore=90;
		int sum=korScore+engScore;
		System.out.println(sum);
		System.out.println("=========================================");
		int count;
		// System.out.println("count="+count);  //변수에 값이 저장되어 있지 않은 상태에서 변수를 사용할 경우 에러 발생
		System.out.println("10진수 100="+100);
		System.out.println("8진수 100="+0100);    //100앞에 0 붙일시 8진수로 표현된다
		System.out.println("16진수 100="+0x100);    //16진수로 표현된다                 //참고
		System.out.println("정수값"+21212121212222L);   //INT 범위가 넘을 때는 뒤에 L(long)을 붙여준다. f붙이는경우는(long long)
		//byte(1Byte),short(2Byte),int(4Byte),long(8Byte)
		//double(8Byte),float(4byte) float도 숫자 뒤에 f붙여줘야함
		
		//필수 접미사.  float -f, long-l, long long-f
		
		System.out.println("float"+4.55555f);
		System.out.println("double"+4.55555);
		//실수값을 지수형태로 표현하여 사용 가능
		System.out.println("=========================================");
	}
}
