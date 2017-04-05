package oo.abstruction;

import java.util.ArrayList;
import java.util.Scanner;

public class GiveMeTheMoney {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> m = new ArrayList();
		m.add("331");
		m.add("821");
		m.add("886");
		m.add("554");
		// String num = s.nextline();
		// System.out.println("請輸入發票的末三碼:");
		// System.out.println("請輸入發票的八碼數字:");

		String n = "12345678";
		System.out.println("原始長度:" + n.length());
		String sub = n.substring(n.length() - 3);
		System.out.println(sub);

		String e = s.nextLine();
		System.out.println("長度:" + e.length());
		String esub = e.substring(e.length() - 3);
		System.out.println(esub);
		// int intsub = s.nextLine();

		if ((esub == m.get(0)) || (esub == m.get(1)) || (esub == m.get(2)) || (esub == m.get(2))) {
			System.out.println("331中獎");
		} else {

		}
	}
}