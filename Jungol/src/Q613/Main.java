package Q613;

import java.util.Scanner;

class Main{
	private String Name;
	private String School;
	private int Grade;
	

	public Main(String Name, String School, int Grade) {
		this.Name = Name;
		this.School = School;
		this.Grade = Grade;
	} //생성자는 추가한것
	
	public void print() {
		System.out.println("Name : " +Name);
		System.out.println("School : " +School);
		System.out.println("Grade : " +Grade);
	}
	//이것도 추가한거
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		String b= sc.next();
		int c = sc.nextInt();
		sc.close();
		Main input = new Main(a, b, c); // a,b,c는 추가한것
//		input.setName(a);
//		input.setSchool(b);
//		input.setGrade(c);
//		
		
	//	System.out.printf("Name : %s\n",input.getName());
	//	System.out.printf("School : %s\n",input.getSchool());
	//	System.out.printf("Grade : %d\n",input.getGrade());
	    input.print();
	
	}
}



//public void setName(String Name) {
//this.Name = Name;
//}
//
//public String getName() {
//return Name;
//}	
//public void setSchool(String School) {
//this.School = School;
//}
//
//public String getSchool() {
//return School;
//}	
//public void setGrade(int Grade) {
//this.Grade = Grade;
//	}
//
//public int getGrade() {
//	return Grade;
//	
//}
