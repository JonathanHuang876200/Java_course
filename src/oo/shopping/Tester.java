package oo.shopping;

public class Tester {
	static int price = 6000;

	public static void main(String[] args) {
		Customer a = new Customer();
		SilverCustomer b = new SilverCustomer();
		GoldenCustomer c = new GoldenCustomer();
		a.pay(price = 6000);
		a.moneyback(price = 6000);
		b.pay(price = 6000);
		b.moneyback(price = 6000);
		c.pay(price = 6000);
		c.moneyback(price = 6000);
	}

}
