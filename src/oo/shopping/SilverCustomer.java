package oo.shopping;

public class SilverCustomer extends Customer {
	int price;
	int pay;
	int moneyback;

	public int pay(int price) {
		super.pay(price);
		price = 6000;
		pay = price * 9 / 10;
		return pay;
	}

	public int moneyback(int price) {
		super.moneyback(price);
		price = 6000;
		moneyback = price * 0;
		return moneyback;
	}

}
