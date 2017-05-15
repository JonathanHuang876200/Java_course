package oo.shopping;

public class SilverCustomer extends Customer {
	public void pay(int price) {
		pay = price * 9 / 10;
		System.out.println("銀級應付金額" + pay);
	}

	public void moneyback(int price) {
		price = 6000;
		moneyback = price * 0;
		System.out.println("銀級所得回饋金" + moneyback);
	}

}
