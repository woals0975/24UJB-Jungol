package Q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[5];
		for (int i = 0; i < student.length; i++) {
			String name = sc.next();
			int h = sc.nextInt();
			double w = sc.nextDouble();

			student[i] = new Student(name, h, w);
		}
		sc.close();

		Arrays.sort(student, new Comparator<Student>() {
			public int compare(Student n1, Student n2) {
				char na1 = n1.getname().charAt(0);
				char na2 = n2.getname().charAt(0);
				if (na1 < na2) // 숫자가 작으면 앞으로 즉 알파벳순
					return -1;
				else if (na1 == na2)
					return 0;
				else
					return 1;
			}
		});

		System.out.println("name");
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}
		System.out.println();
		Arrays.sort(student, new Comparator<Student>() {
			public int compare(Student w1, Student w2) {
				double wei1 = w1.getw();
				double wei2 = w2.getw();
				if (wei1 > wei2) // 무거운녀석이 앞으로
					return -1;
				else if (wei1 == wei2)
					return 0;
				else
					return 1;
			}
		});
		System.out.println("weight");
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}

	}

}

class Student {
	private String name;
	private int h;// 키
	private double w;// 무게

	public Student(String name, int h, double w) {
		this.name = name;
		this.h = h;
		this.w = w;
	}

	public String getname() {
		return name;
	}

	public double getw() {
		return w;
	}

	public int geth() {
		return h;
	}

	public void print() {
		System.out.printf("%s %d %.1f\n", name, h, w);
	}

}
