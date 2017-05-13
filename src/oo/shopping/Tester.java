package oo.shopping;

public class Tester {
	static int price = 6000;

	public static void main(String[] args) {
		Customer a = new Customer();
		SilverCustomer b = new SilverCustomer();
		GoldenCustomer c = new GoldenCustomer();
		a.price = 6000;
		b.price = 6000;
		c.price = 6000;
		System.out.println(a.price);
		System.out.println(a.pay);
		System.out.println(a.moneyback);
		System.out.println(b.price);
		System.out.println(b.pay);
		System.out.println(b.moneyback);
		System.out.println(c.price);
		System.out.println(c.pay);
		System.out.println(c.moneyback);
	}

}
