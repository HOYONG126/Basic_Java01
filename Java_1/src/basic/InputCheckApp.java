package basic;

import java.util.Scanner;

public class InputCheckApp {
	public static void main(String[] args) {
		//키보드로 점수를 입력받아 학점을 계산하여 출력하는 프로그램 작성
		// => 100~90 A, 89~80 B, 79~70 C, 69~60 D, 59~0 F
		//=>키보드로 입력된 점수가 0~100범위의 정수값이 아닌경우 에러메세지 출력 후 재입력 되도록 작성
		Scanner scanner= new Scanner(System.in);
		int score;
		do{
			System.out.print("[점수입력0~100]>>");
			score=scanner.nextInt();
		}while(score>100||score<0);
		
		String grade="";
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		System.out.println("학점은 : "+grade);
		scanner.close();
	}

}
