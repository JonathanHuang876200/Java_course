package oo.shopping;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Customer a = new Customer();
		SilverCustomer b = new SilverCustomer();
		GoldenCustomer c = new GoldenCustomer();
		Scanner s = new Scanner(System.in); 
		for (int i = 1; i < 3; i++) {
			System.out.println("請輸入價錢 :");
			String money = s.nextLine();
			int m = Integer.parseInt(money);
			a.pay(m);
			a.moneyback(m);
			b.pay(m);
			b.moneyback(m);
			c.pay(m);
			c.moneyback(m);
		}

	}
}
