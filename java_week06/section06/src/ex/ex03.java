/*�й� : 20215247
�̸� : ������
 �Լ��� �Լ����� ����Ͽ� ����. 
 ����ڷκ��� x ���� �Է¹޾� �Լ����� ����Ͽ� ȭ�鿡 ����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[]args) {
	
		
		double x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��갪 x�� �Է��Ͻÿ� : ");
		
		x = input.nextDouble();
		
		if (x <= 0)
			System.out.printf("�Լ� f(x)�� ����� %.1f",(x*x*x)-(9*x)+2);
		else
			System.out.printf("�Լ� f(x)�� ����� %.1f",7*x+2);
		
		input.close();
		
	}
	
		
	}

