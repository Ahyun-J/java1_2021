/*�й� : 20215247
�̸� : ������
����ڷκ��� �� ���� �Է¹޾� �� ���� ũ�⸦ ���ϴ� ���α׷�*/


package ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b ;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		a = input.nextInt();
		
		System.out.print("�ι��� ���� �Է� : ");
		b = input.nextInt();
		
		if (a>b)
			System.out.printf("ù���� ���� %d�� �ι��� ���� %d���� ũ��",a,b);
		else if (b>a)
			System.out.printf("ù���� ���� %d�� �ι��� ���� %d���� �۴�",a,b);
		else 
			System.out.printf("ù���� ���� %d�� �ι��� ���� %d�� ����",a,b);
input.close();

	}

}
