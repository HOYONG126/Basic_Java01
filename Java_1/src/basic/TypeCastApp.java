package basic;

public class TypeCastApp {

	public static void main(String[] args) {
		//자료형 변환(TypeCast) : 값의 자료형을 일시적으로 변환하여 사용하는 방법
		// 자동 형변환(JVM), 강제 형변환(프로그래머)
		/*1.자동 형변환: 자료형이 다른 값을 연산하기 위한 JVM(JAVA VIRTUAL MACHINE)이 자료형을 일시적 변환
		 * EX) 10+13.5 (정수형+실수형=실수형) 정수형이 실수형으로 자동 형변환
		 */
		System.out.println("결과="+(3+1.5));//3이 double로 자동 형변환 되어 4.5라는 자동 형변환이 됨.
		double d1=10; //10은 10.0으로 자동 형변환
		System.out.println(35/3);   //정수로만 값 표현
		System.out.println(35/3.0); //자동형변환
		int korScore=80, engScore=95;
		int sum=korScore+engScore;
		double ave=sum/2.0;	//int형 sum이 자동형변환
		System.out.println("평균 : "+ ave );
		System.out.println("============================================");
		byte su1=10,su2=20;
		int su3=su1+su2;//su3을 byte로 지정시 오류발생//int 자료형보다 작은 자료형의 값은 무조건 int 자료형으로 형변환되어 연산된다.
		System.out.println("su3 = "+su3);
		System.out.println("============================================");
		//강제형변환 : 프로그래머가 Cast 연산자를 사용하여 원하는 자료형의 값으로 일시적으로 변환
		//변환하여 명령을 작성하는 방법 -(자료형)값
		System.out.println((double)korScore+engScore);  //강제형변환
		System.out.println(korScore);
		double d2=12.6;
		System.out.println((int)d2);	//강제형변환
		
	}
}
