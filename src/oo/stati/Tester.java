package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		Student stu = new Student();
		System.out.println(stu);
		Student stu1 = new Student(79, 96, 81);
		Student stu2 = new Student(69, 58, 91);
		System.out.println(Student.pass);
		stu1.pass = 80;
		stu1.print();
		stu2.print();
		GraduateStudent gstu1 = new GraduateStudent(68, 85, 89);
		GraduateStudent gstu2 = new GraduateStudent(78, 89, 60);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(67, 56, 77));
		list.add(new Student(66, 87, 85));
		list.add(new GraduateStudent(68, 87, 66));
		list.add(new GraduateStudent(66, 87, 66));
//		for (int i = 0; i < list.size(); i++) {
//			Student stu = list.get(i);
//			stu.print();
//		}
	}

}
