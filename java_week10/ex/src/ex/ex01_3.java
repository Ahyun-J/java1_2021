/*�й� : 20215247
�̸� : ������
����ڷκ��� ���̿� �ʺ� �Է¹޾� ��ø�� �ݺ����� �̿��ؼ� ������ ���ϵ��� 
����ϴ� ���α׷�(�̵�갢��)*/

package ex;

import java.util.Scanner;

public class ex01_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		h = input.nextInt();
		
		for(int i=1;i<=h;i++) {
			for(int j1=h-1;j1>=i;j1--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

input.close();
}
	
}
