package ex;

import java.util.Scanner;

public class ex06hint {

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

}
