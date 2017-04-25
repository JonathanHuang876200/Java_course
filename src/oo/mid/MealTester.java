package oo.mid;

import java.util.Scanner;

public class MealTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number;

		Meal a = new Meal(1, 360);
		Meal b = new Meal(2, 200);

		System.out.println("請輸入您想要的餐點號碼");
		number = s.nextInt();

		if (number == 1) {
			System.out.println("您點的是" + a.type + "號餐" + "價錢是" + a.money + "元");
		}
		if (number == 2) {
			System.out.println("您點是" + b.type + "號餐" + "價錢是" + b.money + "元");
		}
	}

}
