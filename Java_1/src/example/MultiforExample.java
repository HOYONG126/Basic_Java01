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
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★
		int start=1;
		int end=5;
		int j=1;
		int k=1;
		for(int i=1; i<=5; i++) {
			while(true) {
				if(j==start) {
					System.out.print("★");
					j++;
				}
				else if(j==end) {
					System.out.print("★");
					break;
				}
				else {
					System.out.print("☆");
					j++;
				}
			}
			end--;
			start++;
			System.out.println("");
			j=1;
		}
		
		System.out.println("===============================================================");
	}
}