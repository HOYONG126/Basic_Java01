package basic;

public class ContinueApp {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i==3) continue;
			System.out.println(i+"\t");
		}
		System.out.println();
		System.out.println("===============================");
		hoyong:for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==2) continue hoyong;
				System.out.print(i+"\t"+j);
			}
			System.out.println();
		}
	}
}
