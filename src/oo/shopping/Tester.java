package oo.shopping;

public class Tester {

	public static void main(String[] args) {
		Customer a = new Customer();
		SilverCustomer b = new SilverCustomer();
		GoldenCustomer c = new GoldenCustomer();
		a.pay(a.price=6000);
		b.pay(b.price=6000);
		c.pay(c.price=6000);
		System.out.print(a.price+" ");
		System.out.print(a.pay+" ");
		System.out.print(a.moneyback);
		System.out.println();
		System.out.print(b.price+" ");
		System.out.println(b.pay+" ");
		System.out.println(b.moneyback);
		System.out.println();
		System.out.print(c.price+" ");
		System.out.println(c.pay+" ");
		System.out.println(c.moneyback);
		
	}

}
