/*�й� : 20215247
�̸� : ������
����ڷκ��� 2�� �������� ��� a , b , c�� �Ǽ��� �Է¹޾� 2�� �������� ��
�� ��� ����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex05 {
	public static void main(String[]agrs) {
 
		//char i = 'i';
		double a,b,c,D,dd, bb;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2�� �������� a�� �Է��� �ּ���(�Ǽ�) : ");
		a = input.nextDouble();
		
		System.out.print("2�� �������� b�� �Է��� �ּ���(�Ǽ�) : ");
		b = input.nextDouble();
		
		System.out.print("2�� �������� c�� �Է��� �ּ���(�Ǽ�) : ");
		c = input.nextDouble();
		
		D = (b*b)-4*a*c;
		dd = Math.sqrt(D); // ��Ʈ ���ϴ� ��� ã�� ���ҽ��ϴ�.
		bb = Math.sqrt((4*a*c)-(b*b));
		
		if(D>0)
			System.out.printf("2�� �������� ���� %.1f,%.1f�Դϴ�.",(-b+dd)/(2*a),(-b-dd)/(2*a));
		else if(D==0)
			System.out.printf("2�� �������� ���� %f�Դϴ�.",-b/(2*a));
		else if(D<0)
			System.out.printf("2�� �������� ���� %fi, %fi �Դϴ�.",(-b+bb)/(2*a),(-b-bb)/(2*a));
		
		input.close();
		
		
	}

}
