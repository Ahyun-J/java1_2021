/*�й� : 20215247
�̸� : ������
����ڷκ��� �� ���� �Է¹޾� �ִ� ������� ���ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,x,y,r;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		a = input.nextInt();
		b = input.nextInt();
		
		x = (a>b)? a:b;
		y = (a>b)? b:a;
		
		while(y != 0) {
			r = x%y;
			x=y;
			y=r;
		}
System.out.printf("�� ���� �ִ� ������� %d", x);
input.close();
	}

}
