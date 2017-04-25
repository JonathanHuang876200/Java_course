package oo.abstruction;

public class Car {

	String brand;
	public int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	/* 屬性 */

	public Car(String brand,String name){
		this(brand,name, type);
	}
	
	public Car(String brand, int cc, String name, String type) { /* 區域變數 */
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
	}

	public float addMilage(int m) { /* 只能加正數 */
		milage = milage + m;
		return milage;
	}

	public void setMilage(int m) {
		milage = m;
	}

	public void maintain() {
		status = 5;
	}

}
