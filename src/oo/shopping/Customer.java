package oo.shopping;

public class Customer {
	int price;
	int pay;
	int moneyback;

	public void pay(int price) {
		price = 6000;
		pay = price;
		System.out.println("應付金額"+pay);
	}

	public void moneyback(int price) {
		moneyback = price * 0;
		System.out.println("所得回饋金"+moneyback);
	}

}
