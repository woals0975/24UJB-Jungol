package Q614;

import java.util.Scanner;

class School {
	private String name = "Jejuelementary";
	private int grade = 6;

	public School() {
		//this.name = "Jejuelementary";
		//this.grade =  6;
	}

	public School(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public void print() {
		System.out.printf("%d grade in %s School\n", grade, name);

	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();

		School input2 = new School();
		input2.print();

		School input = new School(name, grade);
		input.print();
	}
}
