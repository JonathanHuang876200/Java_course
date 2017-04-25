package oo.mid;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketTTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
	}
}
