package oo.shopping;

import java.util.Scanner;

public class Tester {
	static int price = 6000;

	public static void main(String[] args) {
		Customer a = new Customer();
		SilverCustomer b = new SilverCustomer();
		GoldenCustomer c = new GoldenCustomer();
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println("請輸入價錢 :");
			String money = s.nextLine();
			int m = Integer.parseInt(money);
			a.pay(price = m);
			a.moneyback(price = m);
			b.pay(price = m);
			b.moneyback(price = m);
			c.pay(price = m);
			c.moneyback(price = m);
		}

	}
}
