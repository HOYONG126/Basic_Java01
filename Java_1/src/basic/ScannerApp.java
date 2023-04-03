package basic;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
	//System.out: 출력스트림을 사용하여 값을 화면에 전달하는 기능을 제공하는 객체
	//System.in: 키보드로부터 전달된 값을 입력트림을 사용하여 프로그램에 전달하는 기능을 제공하는 객체
		
	//사용자로부터 키포드로 이름과 나이를 입력받아 화면에 출력하는 프로그램 작성
	//Scanner 하고 ctrl+space 하면 자동으로 Scanner import 작성된다.
	//Scanner 클래스 : 입력스트림을(키보드 - System.in , 파일 등)을 전달받아 원하는 자료형으로 입력
	//값을 입력받기 위한 기능(메소드)을 제공하는 클래스
	//Scanner 객체를 생성하여 참조변수에 저장
	//=>참조변수를 사용하여 참조변수에  저장된 객체의 메소드를 호출해 필요한 기능 구현
	Scanner scanner=new Scanner(System.in);
	//키보드로 입력된 값을 문자열로 반환받아 변수에 저장 + 키보드에 입력하고 엔터 눌러줘야함
	System.out.print("이름 입력 >>");	//변수.next자료형();
	String name = scanner.nextLine();   //키보드 입력값이 없는 경우 프로그램의 흐름(스레드)이 일시 중지
	System.out.println(name);
	//Scanner.nextInt():입력값을 정수값으로 변환하여 반환하는 메소드
	//키보드로 입려된 값을 정수값으로 변환받아 변수에 저장
	System.out.print("나이 입력>>");       //scanner.nextInt()인데 정수형 안할시 예외오류발생(프로그램 강제종료)
	int age=scanner.nextInt();				//실수값인 경우 scanner.nextDouble()
	System.out.println(age);
	
	System.out.println("[결과]"+name+"님의 나이는"+age+"살입니다.");
	scanner.close(); //스캐너 사용시 닫아줘야함
}
}
