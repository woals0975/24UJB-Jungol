package Q9013;

public class Main {
	public static void main(String[] args) {
		double x= 1.2340, y=10.3459;
		System.out.print("��ü 7�ڸ��� ���߰� �Ҽ� 4�ڸ����� ���\n");
		System.out.printf("%.4f\n",x);
		System.out.printf("%.4f\n",y);
        x=1.23; y=10.35;
		System.out.print("�Ҽ� 2�ڸ����� ���(�ݿø�)\n");
		System.out.printf("%.2f\n",x);
		System.out.printf("%.2f\n",y);
	}
}



/*��ü 7�ڸ��� ���߰� �Ҽ� 4�ڸ����� ���
x =  1.2340
y = 10.3459

�Ҽ� 2�ڸ����� ���(�ݿø�)
x = 1.23
y = 10.35

"%.3f" = �Ҽ��� 4��° �ڸ����� �ݿø��Ͽ� 3��° �ڸ����� ���´�

Math.round�� �ش���ڸ� �Ҽ��� ê°�ڸ����� �ݿø����ִ� �ż�������
����� �����ָ� �Ҽ��� ��� ����*
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
//���
2.0

1.824

*/
