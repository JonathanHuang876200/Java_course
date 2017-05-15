package oo.shopping;

public class GoldenCustomer extends Customer {
	public void pay(int price) {
		pay = price * 9 / 10;
		System.out.println("金級應付金額" + pay);
	}

	public void moneyback(int price) {
		moneyback = price * 5 / 100;
		System.out.println("金級所得回饋金" + moneyback);
	}

}
