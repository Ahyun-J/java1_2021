/*�й� : 20215247
�̸� : ������
����ڿ��� �� ���� ���ڸ� �Է��ϵ��� �Ͽ� ���� ���� ��, ���� ū ��, �հ� 
�Ǵ� ��� �� �� �ϳ��� �����Ͽ� ����ϴ� �޴���� ���α׷�*/

package ex;

import java.util.Scanner;

public class ex06 {
	public static void main(String[]args) {
	
	int x, y, m ;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("�� ������ �Է��ϼ��� : ");
	
	x = input.nextInt();
	y = input.nextInt();
	
	System.out.println("�޴�");
	System.out.println("1. ������");
	System.out.println("2. ū��");
	System.out.println("3. �հ�");
	System.out.println("4. ���");
	System.out.println("5. ����");
	System.out.print("�޴��� �����ϼ��� : ");
	
	m = input.nextInt();
	
	switch(m) {
	case 1 :
		if (x>y)
			System.out.printf("\n��� : %d", y);
		else 
			System.out.printf("\n��� : %d", x);
		break;
		
	case 2 :
		if (x<y)
			System.out.printf("\n��� : %d", y);
		else 
			System.out.printf("\n��� : %d", x);
		break;
		
	case 3 :
		System.out.printf("\n��� : %d", x+y);
		break;
		
	case 4 :
		System.out.printf("\n��� : %d", (x+y)/2);
		break;
		
	case 5 :
		System.out.print("\n�����մϴ�.");
		break;
		
	default :
			System.err.printf("\n�޴����ÿ���");
			
		input.close();
			
		}
	
	
	}

}

