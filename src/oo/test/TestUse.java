package oo.test;

import java.util.ArrayList;

import oo.abstruction.*; /* "*"找package裡的類別 */

public class TestUse {

	public static void main(String[] args) {
		Car c = new Car("xx", 2000, "name", "type");

		ArrayList<String> a = new ArrayList();
		// String[] numbers = {"331","821","886","554"};
		a.add("331");
		a.add("821");
		// a.add(123);
		a.add("886");
		// a.add(true);
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = (String) a.get(0);
		// int n = (int) a.get(4);
		System.out.println(a.get(2));
	}
}
