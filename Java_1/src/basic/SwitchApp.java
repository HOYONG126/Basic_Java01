package basic;

public class SwitchApp {
	public static void main(String[] args) {
		//switch : 값을 비교하여 명령 선택 실행- 실수값 제외
		/*형식) switch(비교대상)
		 * 		case 값1: 명령; 명령; ... break;
		 * 		case 값2: 명령; 명령; ... break;
		 * 		case 값3: 명령; 명령; ... break;
		 * 			...
		 * 		default: 명령; 명령; ... (생략가능)
		 * 
		 *	 => 비교대상에는 변수 또는 연산식을 작성하여 비교하고자 하는 값 제공
		 *   => 비교대상의 값을 case에 작성된 값과 차례대로 비교하여 같은 경우 해당 위치로부터 작성된 
		 *   모든 명령 실행
		 *   =>case 키워드로 제공되는 값은 리터럴 또는 상수만 작성가능
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
		
	}

}
