package example;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,키보드로 입력된 정수값은 2~9 범위의 정수값만 허용하면 범위를 벗어난 정수값을 입력한 경우
//에러 메세지 출력 후 재입력하도록 프로그램 작성
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    ...
//    7 * 9 = 63
public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇단을 출력할까요? ");
		int gugudan=scanner.nextInt();
		while(gugudan>9||gugudan<2) {
			System.out.println("입력 오류입니다 2~9로 다시 입력해주세요");
			gugudan=scanner.nextInt();
		}
		for(int i=1; i<=9; i++) {
			System.out.println(gugudan+"*"+i+"="+gugudan*i);
		}
		scanner.close();
	}
}

