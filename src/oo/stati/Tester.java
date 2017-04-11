package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(79, 96, 81);
		Student stu2 = new Student(69, 58, 91);
		System.out.println(Student.pass);
		stu1.pass = 80;
		stu1.print();
		stu2.print();
	}

}
