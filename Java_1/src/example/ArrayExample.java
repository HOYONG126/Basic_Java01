package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들의 나이를 저장한 배열 생성하여 참조변수에 저장		
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
		int sum=0;
		int cnt=0;
		for(int i=0; i<=age.length-1; i++) {
			sum+=age[i];
			cnt++;
		}
		double ave=sum/(double)cnt;
		System.out.println("평균 : "+ave+"살");
		//배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요.
		
		
		System.out.println("===============================================================");
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 1명
		int[] age2=new int[6];
		
		for(int i=0; i<age.length; i++) {
			
			for(int j=1; j<=age2.length; j++) {
				
				if(age[i]/10==j) {
					age2[j-1]++;
				}
			}
		}
		for(int i=0; i<age2.length; i++) {
			System.out.println(i+1+"0대는 "+age2[i]+"명 있습니다.");
		}
		System.out.println("===============================================================");
	}
	
}