package oo.shopping;

public class Customer {
	int price;
	int pay;
	int moneyback;

	public int pay(int price) {
		price = 6000;
		pay = price;
		return pay;
	}

	public int moneyback(int price) {
		moneyback = price * 0;
		return moneyback;
	}

}
