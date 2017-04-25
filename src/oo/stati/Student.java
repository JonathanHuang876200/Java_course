package oo.stati;

public class Student {
	int english;
	int chinese;
	int math;
	static int pass = 60;
	static {
		System.out.println("STATIC!!");
		/*System.out.println(english);無法執行因為static是在物件生成前就有了*/
		System.out.println(pass);/*因為pass也是static的部分*/
	}

	public Student(int english, int chinese, int math) {
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
}
