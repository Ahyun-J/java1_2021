/*�й� : 20215247
�̸� : ������
while���� �̿��ؼ� ����ڰ� 0�� �Է��ϰų� �Էµ� �� ���� 500�� ���� ��� ���α׷��� 
�����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		Scanner input = new Scanner(System.in);
		
		while(x<=500) {
			System.out.print("������ ���� �Է��ϼ��� : ");
			x = x+input.nextInt();
			System.out.printf("��������� �������� %d�Դϴ�.\n",x);
			if(x>=500) {
				System.out.printf("\n�� �������� %d�Դϴ�.",x);
				break;
			}


		}
		
	}

}

/*
 *��Ʈ
 * package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in,sum = 0;
		Scanner input = new Scanner(System.in);
		
		while(sum<=500) {
			System.out.print("������ ���� �Է��ϼ��� : ");
			in = input.nextInt();
			
			if(in==0) {
				break;
			}
			sum = in + sum;
			System.out.printf("��������� �������� %d�Դϴ�.\n",sum);

		}
		System.out.printf("�� �������� %d�Դϴ�.",sum);
	}

}*/
