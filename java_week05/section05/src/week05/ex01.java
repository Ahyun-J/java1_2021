/*�й� : 20215247
�̸� : ������
�������� �Է¹޾� ���ǿ� ������ ���ϴ� ���α׷�*/

package week05;
//import java.util.*;
import java.util.Scanner;


public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double v, s;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ��� : ");
		r = input.nextInt();
		
		v = (4.0/3.0)*3.14*r*r*r;
		s = 4.0*3.14*r*r;
		
		System.out.println("������"+r+"�� ���Ǵ� "+v+"������ "+s+"�Դϴ�.");
		input.close();

	}

}
