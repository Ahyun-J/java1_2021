/*�й� : 20215247
�̸� : ������
10000���� ���� ������ �Է¹޾Ƽ� �и��Ͽ� ����ϴ� ���α׷�*/

package week05;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, N_1000;
		int N_100;
		int N_10;
		int N_1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� :");
		
		number = input.nextInt();
		
		 N_1000 = number / 1000 ;
		 number = number %1000;
		 
		 N_100 = number / 100 ;
		 number = number%100;
		 
		 N_10 = number / 10 ;
		 number = number%10;
		 
		 N_1 = number ;
		 
		 
		System.out.println("õ�� �ڸ� : " + N_1000);
		System.out.println("���� �ڸ� : " + N_100);
		System.out.println("���� �ڸ� : " + N_10);
		System.out.println("���� �ڸ� : " + N_1);
		input.close();

	}

}
