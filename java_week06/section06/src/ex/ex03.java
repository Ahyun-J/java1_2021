/*학번 : 20215247
이름 : 조아현
 함수의 함수값을 계산하여 보자. 
 사용자로부터 x 값을 입력받아 함수값을 계산하여 화면에 출력하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[]args) {
	
		
		double x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("계산값 x를 입력하시오 : ");
		
		x = input.nextDouble();
		
		if (x <= 0)
			System.out.printf("함수 f(x)의 결과는 %.1f",(x*x*x)-(9*x)+2);
		else
			System.out.printf("함수 f(x)의 결과는 %.1f",7*x+2);
		
		input.close();
		
	}
	
		
	}

