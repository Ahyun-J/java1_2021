/*�й� : 20215247
�̸� : ������
����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ��ü���� ����� �� �񸸵��� ����ϰ� 
�� ������ ���� �񸸿��θ� ����ϴ� �Ǵ��ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex04 {
	public static void main(String[]agrs) {

	double x,y,z,d;
	// String = null;
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Ű�� �Է��ϼ��� : ");
	x = input.nextDouble();
	
	System.out.printf("�����Ը� �Է��ϼ��� : ");
	y = input.nextDouble();
	
	z = (x-100)*0.9;
	d = (y-z)/z*100;
	
	if(d<20)
		System.out.println("�񸸵��� �����Դϴ�.");
	else if(20<=d && d<30)
		System.out.println("�񸸵��� �浵���Դϴ�.");
	else if(30<=d && d<50)
		System.out.println("�񸸵��� �ߵ���Դϴ�.");
	else
		System.out.println("�񸸵��� ���� �Դϴ�.");
	
	input.close();
	} 
		
}

