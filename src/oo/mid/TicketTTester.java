package oo.mid;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketTTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number;
		ArrayList<Integer> id = new ArrayList();
		id.add(1);
		id.add(2);
		ArrayList<String> name = new ArrayList();
		name.add("X-man");
		name.add("Batman");
		ArrayList<Float> price = new ArrayList();
		price.add(200f);
		price.add(150f);
		System.out.println("請輸入你想看的電影代碼");
		number = s.nextInt();
		if (number == 1) {
			System.out.println("您輸入的代碼是" + id.get(0) + "您想看的是" + name.get(0) + "票價是" + price.get(0) + "元");
		}
		if (number == 2) {
			System.out.println("您輸入的代碼是" + id.get(1) + "您想看的是" + name.get(1) + "票價是" + price.get(1) + "元");
		}
	}
}
