package oo.shopping;

public class SilverCustomer extends Customer {
	int price;
	int pay;
	int moneyback;

	public void pay(int price) {
		price = 6000;
		pay = price * 9 / 10;
		System.out.println("銀級應付金額"+pay);
	}

	public void moneyback(int price) {
		price = 6000;
		moneyback = price * 0;
		System.out.println("銀級所得回饋金"+moneyback);
	}

}
