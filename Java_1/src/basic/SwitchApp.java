package basic;

public class SwitchApp {
	public static void main(String[] args) {
		//switch : 값을 비교하여 명령 선택 실행- 실수값 제외
		/*형식) switch(비교대상)
		 * 		case 값1: 명령; 명령; ... break;
		 * 		case 값2: 명령; 명령; ... break;
		 * 		case 값3: 명령; 명령; ... break;(생략가능)
		 * 			...
		 * 		default: 명령; 명령; ... (생략가능)
		 * 
		 *	 => 비교대상에는 변수 또는 연산식을 작성하여 비교하고자 하는 값 제공
		 *		+double형 비교대상에 불가
		 *   =>case 키워드로 제공되는 값은 리터럴 또는 상수만 작성가능
		 *   	+변수불가
		 *  // => case 키워드로 제공되는 값은 리터럴 또는 상수(Constant)만 작성 가능
			// => case 키워드로 제공되는 값이 중복되어 작성될 경우 에러 발생
			// => break 키워드를 만나면 switch 구문 강제 종료
			// => case 키워드로 제공되는 값이 모든 다른 경우 default 키워드의 명령 실행 - 생략 가능
		 *   
		 */
		int choice=4;
		switch(choice) {
		case 1: 
			System.out.println("수성으로 이동");	break;
		case 2: 
			System.out.println("금성으로 이동");	break;
		case 3: 
			System.out.println("화성으로 이동");	break;
		default:
			System.out.println("지구로 이동합니다.");
		}
		System.out.println("================================");
		
		int jumsu=84;
		
		String grade;
		
		switch(jumsu/10) {
		case 10:
		case 9:
			grade="A"; break;
		case 8:
			grade="B"; break;
		case 7:
			grade="C"; break;
		case 6:
			grade="D"; break;
		default:
			grade="F"; break;
		}
		System.out.println("학점은 ="+grade);
	}

}
