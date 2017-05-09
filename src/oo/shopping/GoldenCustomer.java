package oo.shopping;

public class GoldenCustomer {
	int price;
	int pay;
	int moneyback;

	public GoldenCustomer() {
		this.price = price;
		this.pay = pay;
		this.moneyback = moneyback;
	}

	public int pay(int price) {
		pay = price * 9 / 10;
		return pay;
	}

	public int moneyback(int price) {
		moneyback = price * 5 / 100;
		return moneyback;
	}

}
