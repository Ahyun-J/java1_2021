/*�й� : 20215247
�̸� : ������
�� ���� �Է¹޾� �� �� �� ū ���� ����ϴ� ���α׷� */

package week05;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int big;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ� :");
		
		x=input.nextInt();
		y=input.nextInt();
		
		big = (x>y)?x:y;
		
		System.out.println("ū ���� "+big+"�Դϴ�.");
		input.close();

	}

}
