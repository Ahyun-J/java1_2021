/*�й� : 20215247
�̸� : ������
����ڷκ��� �Է¹��� ������ Ȧ�� ���� ¦�������� �Ǵ��ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[]args) {
		
		 int a;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("������ �Է��Ͻÿ� : ");
		 a = input.nextInt();
		 
		 if (a%2==0)
			 System.out.printf("%d�� ¦���Դϴ�.",a);
		 else
			 System.out.printf("%d�� Ȧ���Դϴ�.",a);
		 
		input.close();
		
		
		} 
		
	}
	