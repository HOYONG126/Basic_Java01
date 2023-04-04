package basic;

public class LottoApp {

	public static void main(String[] args) {
		//1~45 범위의 정수형 난수값을 6개 제공받아 출력하는 프로그램 작성
		//=> 6개의 난수값은 서로 중복되지 않도록 작성하며 오름차순 정렬하여 출력
		//정렬(sort) : 값을 차례대로 나열하는 기능 - 오름차순 정렬(Ascending Sort, 내림차순 정렬(Descending Sort)
		int[] lotto=new int[6];
		
		//1~45 범위의 정수난수를 6개 제공받아 배열 요소에 차례대로 저장
		for(int i=0; i<lotto.length; i++) {
			//요소에 저장된 새로운 난수값을 기존 요소의 난수값과 모두 비교하여 같은 값이 있는 경우 반복문을 이용하여 새로운 난수값출력
			loop: while(true) {
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0; j<=i-1; j++) {
					if(lotto[i]==lotto[j]) {
					continue loop;
					}
				}
				break;
			}
		}
		System.out.println("행운의 숫자>>");
		for(int number : lotto) {
			System.out.print(number+"\t");
		}
		System.out.println("");
		
		System.out.println("==============================================================================");
		System.out.println("");
		
		//선택 정렬 알고리즘을 사용하여 오름차순 정렬
		for(int i=0; i<lotto.length-1; i++) {//비교하기 위한 배열 요소의 첨자를 표현하는 반복문 0~ 끝-1까지
			for(int j=i+1;j<lotto.length; j++) { //피비교 요소의 첨자를 표현하는 반복문 : 비교+1~끝
				if(lotto[i]>lotto[j]) {
					//swap
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		System.out.println("행운숫자 >> ");
		for(int number: lotto) {
			System.out.print(number+"  ");
		}
	}
}
