/*�й� : 20215247
�̸� : ������
�־��� ������ ���迬��� ���������� ����� ����ϴ� ���α׷� */

package week05;
//import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int age,computer,english,math,absence,leap,num ;
		char married, gender ;
		double sum, average;
		
		married = 'N';
		gender = 'W';
		age = 18;
		computer = 80;
		english = 90;
		math = 65;
		leap = 2021;
		absence = 3;
		num = 15;
		
		sum = computer + english + math;
		average = sum / 3.0;
		
		System.out.println("1. ��ȥ�ΰ� : " + (married == 'Y'));
		System.out.println("2. ���̰� 19�� �̻��̰� �����ΰ� : "+ (age >= 19 && gender == 'M'));
		System.out.println("3. ��ǻ�Ϳ� ���� �׸��� ���� ��ΰ� 90�� �̻��ΰ� : " + (computer >= 90 && english >= 90 && math >= 90));
		System.out.println("4. ������ 200�� �̻��̰ų� ����� 60�� �̻��ΰ� : " +  (sum >= 200 || average >= 60));  
		System.out.println("5. ������ 60�� �̸��̰ų� �ἮȽ���� 4�� �̻��ΰ� : "+ (computer <60 && english<60 && math < 60 || absence >= 4));
		System.out.println("6. ������ �⵵�� �����ΰ� : " + ((leap % 4 == 0 )? "����":"����ƴ�"));
		System.out.println("7. �Էµ� ���ڰ� ¦���ΰ� : " + ((num % 2 == 0)? "¦��":"Ȧ��"));
		System.out.println("8. �Էµ� ���ڰ� 3�� 5�� ������ΰ� : " + ((num % 3 == 0)&&(num % 5 == 0)));
		
	}
		
}
		/*
		 * int n; int a;
		 * 
		 * Scanner input = new Scanner(System.in); System.out.print("��ȥ�ΰ�? Y/N : ");
		 * 
		 * n = input.nextInt();
		 * 
		 * String str = (n == Y)? "��ȥ�̴�":"��ȥ�� �ƴϴ�.";
		 * 
		 * 
		 * System.out.println("a"); input.close();
		 
	}

}


 * 1. ��ȥ�ΰ� ( ex: married == ��y��) 
 * 2. ���̰� 19�� �̻��̰� �����ΰ� ( ex : age >= 19 && gender == ��m��) 
 * 3. ��ǻ�Ϳ� ���� �׸��� ���� ��ΰ� 90�� �̻��ΰ� ( computer >= 90 && english >= 90 && math >= 90 == 's' 
 * 4. ������ 200�� �̻��̰ų� ����� 60�� �̻��ΰ�  (total >= 200 || average >= 60 = 'g')
 * 5. ������ 60�� �̸��̰ų� �ἮȽ���� 4�� �̻��ΰ�  (score < 60 || absence >= 4 = 'b')
 * 6. ������ �⵵�� �����ΰ� (year % 4 == 0 )? "����":"����ƴ�";
 * 7. �Էµ� ���ڰ� ¦���ΰ� (x % 2 == 0)? "¦��":"Ȧ��";
 * 8. �Էµ� ���ڰ� 3�� 5�� ������ΰ� (y % 3 == 0)&&(y % 5 == 0) == 'h'
 */