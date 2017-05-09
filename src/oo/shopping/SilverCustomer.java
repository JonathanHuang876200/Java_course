package oo.shopping;

public class SilverCustomer {
	int price;
	int pay;
	int moneyback;

	public SilverCustomer() {
		this.price = price;
		this.pay = pay;
		this.moneyback = moneyback;
	}

	public int pay(int price) {
		pay = price * 9 / 10;
		return pay;
	}

	public int moneyback(int price) {
		moneyback = price * 0;
		return moneyback;
	}

}
