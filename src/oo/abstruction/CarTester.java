package oo.abstruction;

public class CarTester {
	public static void main(String[] args) {
	/*	Car c1 = new Car("Toyota", 1800, "Altis", "Sedan");
		Car c2 = new Car("Mercedes", 3500, "cls", "Coupe");
		Car c3 = new Car("Ferrari", 6000, "Enzo", "Sport");*/

		Car[] cars = new Car[3]; /*Car 類別 = cars 矩陣*/
//		System.out.println(cars[0]);

		cars[0] = new Car("Toyota", 1800, "Altis", "Sedan");
		cars[1] = new Car("Mercedes", 3500, "cls", "Coupe");
		cars[2] = new Car("Ferrari", 6000, "Enzo", "Sport");

		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[0].id);
//			System.out.println(i);
			int x =0;/*for 裡面生存區域*/
			cars[0].id = 01;
			cars[1].id = 02;
			cars[2].id = 03;
			

			class AA {

			}
			AA a = new AA();
		}
		
			
		}

	public/* 身體 */ void/* 回傳直 */ xxxx(/* 參數 */) {
		
	}


	
}
