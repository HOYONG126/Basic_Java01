package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=(int)(Math.random()*100)+1;
		int cnt=0;
		for(int i=1; i<=10; i++) {
			System.out.print("1~100중 컴퓨터의 숫자를 맞춰보세요 :");
			int user=scanner.nextInt();
			while(user>100||user<1) {
				System.out.print("범위 오류입니다. 다시 입력하세요 : ");
				user=scanner.nextInt();
			}
			cnt++;
			if(number==user) {
				System.out.println("정답입니다.");
				System.out.println(cnt+"번 시도하셨습니다.");
				break;
			}
			else if(user>number){
				System.out.println("큰 값을 입력하셨습니다.");
			}
			else {
				System.out.println("작은 값을 입력하셨습니다.");
			}
			if(cnt==10) {
				System.out.println("정답은"+number+"였습니다. 10회안에 맞추지 못했습니다.");
				break;
			}
		}
		scanner.close();
	}
}

