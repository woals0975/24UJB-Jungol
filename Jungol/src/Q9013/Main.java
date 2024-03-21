package Q9013;

public class Main {
	public static void main(String[] args) {
		double x= 1.2340, y=10.3459;
		System.out.print("전체 7자리로 맞추고 소수 4자리까지 출력\n");
		System.out.printf("%.4f\n",x);
		System.out.printf("%.4f\n",y);
        x=1.23; y=10.35;
		System.out.print("소수 2자리까지 출력(반올림)\n");
		System.out.printf("%.2f\n",x);
		System.out.printf("%.2f\n",y);
	}
}



/*전체 7자리로 맞추고 소수 4자리까지 출력
x =  1.2340
y = 10.3459

소수 2자리까지 출력(반올림)
x = 1.23
y = 10.35

"%.3f" = 소수점 4번째 자리에서 반올림하여 3번째 자리까지 나온다

Math.round는 해당숫자를 소수점 챗째자리에서 반올림해주는 매서드지만
사용후 나눠주면 소수점 얻기 가능*
*
ex
public class CordJgwow {
    public static void main(String[] args) {

        double n1 = 6.2;
        double n2 = 3.4;
        double result = n1/n2;

        double Number;

        Number = Math.round(result);
        System.out.println(Number);

        Number = Math.round(result * 1000) / 1000.0;
        System.out.println(Number);

    }
}
//출력
2.0

1.824

*/
