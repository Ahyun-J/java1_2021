/*�й� : 20215247
�̸� : ������
���� �ݺ���( ��ø for�� )�� ���ǹ� if�� continue�� �̿��ؼ� ����ڷκ��� �Է¹��� 
���ڱ����� ��� ���� �� �Ҽ�(1�� �ڱ� �ڽ� �����θ� ������ �������� 1���� ū ���� ����)���� 
����ϴ� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0;
		
		System.out.print("��� �ִ밪 �Է� : ");
		a = input.nextInt();
		System.out.printf("�Ҽ� : ");
		for(int i=1;i<=a;i++) {
			int count = 0;
			for( int j = i; j>=1;j--) {
				if(i%j==0)
					count++;
			}
			if(count == 2)
				System.out.printf("%d ",i);
		}

	input.close();}

}
