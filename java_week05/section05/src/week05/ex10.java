/*�й� : 20215247
�̸� : ������
�л��� �̹� �б� ��� ������ ����ϴ� ���α׷� */

package week05;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int computer, C, english,math;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ǻ�� ���� ������ ������ �Է��Ͻÿ�. : ");
		computer = input.nextInt();
		System.out.print("C��� ���α׷��� ������ ������ �Է��Ͻÿ�. :");
		C = input.nextInt();
		System.out.print("���� ������ ������ �Է��Ͻÿ�. : ");
		english = input.nextInt();
		System.out.print("�Ϲ� ���� ������ ������ �Է��Ͻÿ�. :");
		math = input.nextInt();
		
		average = (double)(computer+C+english+math)/4;
		
		System.out.print("��� ������" + average +"�Դϴ�.");
		input.close();

	}

}
