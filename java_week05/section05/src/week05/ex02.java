/*�й� : 20215247
�̸� : ������
Ű�� �����Ը� �Է¹޾� ǥ��ü�߰� �񸸵��� ����ϴ� ���α׷� */

package week05;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,g;
		double m, b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �����Ը� �Է��ϼ��� : ");
		c = input.nextInt();
		g = input.nextInt();
		
		m = (c-100)*0.9;
		b = (g-m)/m*100;
		
		System.out.println("ǥ�� ü���� "+m+", �񸸵��� "+b+"�Դϴ�.");
		input.close();
		

	}

}
