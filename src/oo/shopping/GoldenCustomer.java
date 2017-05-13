package oo.shopping;

public class GoldenCustomer extends Customer {
	int price;
	int pay;
	int moneyback;

	public int pay(int price) {
		super.pay(price);
		this.price = price;
		pay = price * 9 / 10;
		return pay;
		System.out.println(pay);
	}

	public int moneyback(int price) {
		this.price = price;
		moneyback = price * 5 / 100;
		return moneyback;
		System.out.println(moneyback);
	}

}
