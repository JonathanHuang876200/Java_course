package oo.shopping;

public class SilverCustomer extends Customer {
	int price;
	int pay;
	int moneyback;

	public void pay(int price) {
		super.pay(price);
		price = 6000;
		pay = price * 9 / 10;
		System.out.println("應付金額"+pay);
	}

	public void moneyback(int price) {
		super.moneyback(price);
		price = 6000;
		moneyback = price * 0;
		System.out.println("所得回饋金"+moneyback);
	}

}
