package basic;

public class ArrayApp {
	public static void main(String[] args) {
		//Java 자료형 : 원시형과 참조형
		//원시형 : 값을 표현하기 위한 자료형 - byte, short, int, long, char, float, double, boolean
		//★참조형: 특정 대상을 표현하기 위한 자료형-배열(Array), 클래스, 인터페이스, 나열형
		
		//기본형 변수 : 원시형(기본형)으로 생성된 변수-값을 저장하기 위한 변수 ex) int num=100;
		//참조형 변수 : 참조형으로 생성된 변수 - 특정 대상의 메모리 주소값을 저장하기 위한 변수 ex)String name="홍길동";
		// =>힙영역에 생성된 배열 또는 객체의 메모리 주소를 저장하여 접근하기 위해 사용
		// =>비교 연산자를 사용하여 참조 변수를 비교할 경우 참조변수의 저장된 메모리 주소 비교
		// =>참조변수에 배열 또는 객체를 저장하지 않을 경우 초기값으로 null 저장
		//null : 아무런 것도 없을 표현하기 위한 키워드
		
		//Java프로그램에서 사용하는 메모리 영역
		// => 메소드 영역 (method area), 힙 영역(heap area), 스택 영역(stack area)
		//1. 메소드 영역 : 클래스 파일(XXX.class)의 java 자료형 (클래스, 인터페이스 , 나열형)을 읽어 저장하는 영역
		//2. 힙 영역 : 배열 또는 객체를 저장하기 위한 영역 - new 연산자 이용
		// => 메모리에 이름 설정 불가능 : 참조변수에 객체 또는 배열의 메모리 주소(HashCode)를 저장하여 접근 필요
		//3. 스택영역 : 지역변수(기본형 변수 또는 참조형 변수)를 저장하기 위한 영역 - FOLO(first in last out)
		
		//배열 Array : 같은 자료형의 값을 여러개 저장하기 위한 메모리를 할당받기 위해 사용하는 자료형
		//=>일괄처리를 목적으로 사용하는 자료형-배열의 사용 목적
		//=> 1차원 배열과 다차원 배열(2차원 배열, 3차원 배열 등)로 구분
		// =>1차원 배열: 다수의 값을 저장하기 위한 자료형, 다차원 배열:다수의 배열을 저장하기 위한 자료형
		
		//1차원 배열을 생성하여 참조변수에 생성된 배열의 메모리주소(해쉬코드)를 저장
		//★형식) 자료형[] 참조변수=new 자료형[갯수];
		//=> new 자료형[갯수]: 자료형의 값을 갯수만큼 저장 가능한 메모리 할당 -1차원 배열
		//=>자료형[] 참조변수: 1차원 배열의 메모리 주소를 저장하기 위한 참조변수 생성
		//자료형 참조변수[] 형식으로 참조변수 생성 가능
		//1차원 배열에서 값을 저장하기 위한 메모리 공간을 요소element로 표현
		//=> 배열의 요소는 첨자(index: 0부터 1씩 증가되는 정수값)를 이용하여 구분
		//=> 생성된 배열의 요소에는 기본값(숫자형:0 , 논리형:false, 참조형(객체):null)이 자동 저장
		int[] num = new int[3];
		System.out.println("num = "+num);
		System.out.println("=======================================");
		//참조변수와 배열의 요소를 구분하는 첨자를 사용하여 배열 요소에 접근 가능
		//형식) 참조변수[첨자]-배열의 요소를 표현하는 방법
		System.out.println("num[0]="+num[0]);
		System.out.println("num[1]="+num[1]);
		System.out.println("num[2]="+num[2]);
		//배열의 요소를 구분하는 첨자를 초과하여 잘못 사용한 경우 ArrayIndexOutOfBoundsException 발생 ->예외발생으로 프로그램 강제종료
		// System.out.println("num[3]="+num[3]);
		System.out.println("=======================================");
		//참조변수.length : 배열 요소의 갯수를 제공
		System.out.println("num의 갯수 :"+num.length);
		System.out.println("=======================================");
		//배열 요소를 구분하는 첨자는 변수 또는 연산식 사용하여 표현 가능
		int index=0;
		num[index]=10;
		num[index+1]=20;
		num[index+2]=30;
		//for 구문을 사용하여 배열 요소에 대한 일괄처리
		// =>for 구문의 초기식, 조건식, 증감식에서 사요아는 변수를 첨자로 표현하여 일괄처리 ->입력할 때 , 출력할 때, 계산할 때 일괄처리에 사용
		for(int i=0; i<num.length; i++){
			System.out.println("num["+i+"] = "+num[i]);
		}
		System.out.println("=======================================");
		//배열 생성시 배열 요소의 기본값 대신 원하는 초기값 저장 가능
		//형식) 자료형[]참조변수=new 자료형[]{초기값, 초기값, ...};
		// =>나열된 초기값의 갯수만큼 배열에 요소의 갯수만큼 요소의 갯수를 가지고 있는 배열 생성
		int[] su1=new int[] {10,20,30};
		for(int i=0; i<su1.length; i++) {
			System.out.println("su1["+i+"] ="+su1[i]);
		}
		System.out.println("=======================================");
		//블럭 내부에 값을 나열하여 배열 생성 가능
		//형식)자료형[] 참조변수={초기값, 초기값, ... };
}
}
