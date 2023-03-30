package example;

public class OperatorExample {

	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int score=245678;
		int day1=43200;
		int time1=3600;
		int day=score/day1;
		int time=(score-day*day1)/time1;
		int minute=((score-day*day1)-time*time1)/60;
		int second=(((score-day*day1)-time*time1)-minute*60)/60;
		System.out.println(day+"일"+time+"시"+minute+"분"+second+"초");

		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
		int airplane = 15000;
		int number=20;
		int disPriceNumber=15;
		double discountPercent=0.75;
		double allPrice=airplane*(double)disPriceNumber+((double)airplane*(number-disPriceNumber)*discountPercent);
		System.out.println(allPrice+"만원");

		System.out.println("===============================================");
	}

}
