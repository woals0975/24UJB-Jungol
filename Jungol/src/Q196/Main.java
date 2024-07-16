package Q196;

import java.util.Scanner;

public class Main {
	private String name;
	private String tel;
	private String addr;

	
	public void Main(String name, String tel, String addr) {
		int i = 0;
		while(true) {
			if(this.name==null) {
				this.name = name;
				this.tel = tel;
				this.addr = addr;
				break;
			}
			
		char x = this.name.charAt(i);
		char y = name.charAt(i);
		if(x>y) { // 더 크다는건 후순위라는뜻
		 this.name = name;
		 this.tel = tel;
		 this.addr = addr;
		 break;
		}else if(x==y) { // 같으면 한번더
			i++;
		}else if(x<y) { // 더 작으면 기존대로
			break;
		}
		}
	}
	
	public void print() {
		System.out.printf("name : %s\n",name); 
		System.out.printf("tel : %s\n",tel); 
		System.out.printf("addr : %s\n",addr);
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Main abc = new Main();
	for(int i=0; i<3;i++) {
	String in = sc.nextLine();
	String[] a = in.split(" ");
	abc.Main(a[0], a[1], a[2]);
	}
	sc.close();
	abc.print();
	
	}
}
