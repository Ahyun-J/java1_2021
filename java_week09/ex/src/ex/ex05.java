/*�й� : 20215247
�̸� : ������
 Ű����κ��� 1���� 9 ������ ������ �Է¹޾� �ش� �������� ����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��ϼ��� : ");
		c = input.nextInt();
		
		for(i=1;i<=9;i++) {
			System.out.printf("%d * %d = %2d\n",c,i,c*i);
		}
		input.close();		
	}
	
}

