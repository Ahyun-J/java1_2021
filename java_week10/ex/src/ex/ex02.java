/*�й� : 20215247
�̸� : ������
����ڷκ��� 0�� �ƴ� ������ �Էµ� �� ������ �հ� ����� ����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, i =1;
		int  sum = 0;
		double avg = 0;
		
		do {
			System.out.print("�����Է� : ");
			a = input.nextInt();
			if (a == 0) break;
			sum+=a;
			avg=(double)sum/i;
			System.out.printf("-> ��:%s ���:%s \n",sum,avg);
			i++;
		}while(true);
		
		System.out.print("-> ���� ");
		input.close();
	}

}
