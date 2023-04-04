package example;

public class MultiforExample {
	public static void main(String[] args) {
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("★");
			}
			System.out.println("");
		}

		System.out.println("===============================================================");
		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("☆");
			}
			for(int k=i; k<=5; k++) {
				System.out.print("★");
			}
			System.out.println("");
		}


		System.out.println("===============================================================");
		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=2*i-1; j++) System.out.print("★");
			System.out.println("");
		}
		
		System.out.println("===============================================================");
		loop: for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0) {
					continue loop;
				}
			System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("===============================================================");
		//★☆☆☆★ 1 5
		//☆★☆★☆ 2 4 
		//☆☆★☆☆ 3 3
		//☆★☆★☆ 4 2 
		//★☆☆☆★ 5 1
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j||i+j==6) {
					System.out.print("★");
				}
				else System.out.print("☆");
			}
			System.out.println("");
		}
		System.out.println("===============================================================");
	}
}