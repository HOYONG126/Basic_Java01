package basic;

public class MultiForApp {
	public static void main(String[] args) {
		
		int cnt=0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println("========================================================");
		for(int j=1; j<=4; j++) {
			for(int i=1; i<=7; i++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("========================================================");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*=\t");
			}
			System.out.println("");
		}
		System.out.println("========================================================");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(j +"*"+i+"="+i*j+"  ");
			}
			System.out.println("");
		}
		System.out.println("========================================================");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("＠");
			}
			System.out.println("");
		}
		System.out.println("========================================================");
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=j; i++) {
			System.out.print("★");
			}
			System.out.println("");
		}
	}

}
