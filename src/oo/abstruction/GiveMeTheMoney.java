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
//	String num = s.nextline();
//		System.out.println("請輸入發票的末三碼:");

String n = "13456723121298331";
System.out.println(n.length());
String sub = n.substring(n.length()-3);
System.out.println(sub);

	}
}