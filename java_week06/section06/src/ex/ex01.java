/*학번 : 20215247
이름 : 조아현
사용자로부터 두 수를 입력받아 두 수의 크기를 비교하는 프로그램*/


package ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b ;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		a = input.nextInt();
		
		System.out.print("두번쨰 정수 입력 : ");
		b = input.nextInt();
		
		if (a>b)
			System.out.printf("첫번쨰 정수 %d가 두번쨰 정수 %d보다 크다",a,b);
		else if (b>a)
			System.out.printf("첫번쨰 정수 %d가 두번쨰 정수 %d보다 작다",a,b);
		else 
			System.out.printf("첫번쨰 정수 %d와 두번쨰 정수 %d가 같다",a,b);
input.close();

	}

}
