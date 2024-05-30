package Q195;

import java.util.Scanner;

public class Main {
	private String name;
	private String tel;
	private String addr;
	
	public void Main(String name, String tel,String addr) {
			this.name = name;
			this.tel = tel;
			this.addr = addr;
	}
	
	public void print() {
		System.out.printf("name : %s\n",name); 
		System.out.printf("tel : %s\n",tel); 
		System.out.printf("addr : %s\n",addr); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		String[] a = in.split(" ");
		Main abc = new Main();
		abc.Main(a[0], a[1], a[2]);
		abc.print();

	}

}
