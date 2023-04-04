package basic;

import java.util.Scanner;
//가위바위보 게임 프로그램 작성
//=>컴퓨터(난수값)과 사용자(키보드 입력값)의 가위바위보 대결
//사용자가 이길 경우 대결을 반복 실행하며 질 경우 대결 종료
//대결 종료 후 사용자의 승리 횟수 출력

public class RpaGameApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int win=0;
			while(true) {
				System.out.print("1: 가위 ,2 :바위 3: 보 입니다. 입력해주세요 : ");
				int user=scanner.nextInt();
				if( user>3 || user<0) {
					System.out.println("잘못 입력하셨습니다. 1~3범위에서 입력해주세요.");
					continue;
				}
				int computer=(int)(Math.random()*3)+1;
				
				System.out.print("컴퓨터는 ");
				switch(computer) {
				case 1: System.out.println("가위"); break;
				case 2: System.out.println("바위"); break;
				case 3: System.out.println("보"); break;
				}
				System.out.print("사용자는 ");
				switch(user) {
				case 1: System.out.println("가위"); break;
				case 2: System.out.println("바위"); break;
				case 3: System.out.println("보"); break;
				}
				
				if(user==computer) {
					System.out.print("비겼습니다. 다시 대결하세요 ! >>");
					continue;
				}
				else if(computer==user+1||(computer==3&&user==1)) {
					System.out.println("컴퓨터 승 !");
					break;
				}
				else {
					System.out.println("사용자 승!");
					win++;
				}
			}
		System.out.println("사용자가 승리한 횟수는 "+ win +"번 입니다.");
scanner.close();
}
}
