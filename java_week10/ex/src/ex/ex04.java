/*�й� : 20215247
�̸� : ������
�Ǻ���ġ������ ����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int f0 = 0;
		int f1 =1;
		int a, q;
		int j =0;
		
		System.out.print("�Ǻ���ġ������ ������ ���� �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.printf("�Ǻ���ġ���� : ");
		
		for(int i=0;i<a-1;i++) {

			if(i<2) {
			System.out.printf("%d, ",i);
			continue;
			}
			
			q = f0 + f1;
			System.out.printf("%d, ",q);
			f0 = f1;
			f1 = q;
			j++;
		}
		q = f0 + f1;
		if (j<a) {
			System.out.printf("%d ",q);}
		
		input.close();	

	}}
