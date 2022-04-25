/*학번 : 20215247
이름 : 조아현
사용자로부터 입력받은 정수가 홀수 인지 짝수인지를 판단하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[]args) {
		
		 int a;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("정수를 입력하시오 : ");
		 a = input.nextInt();
		 
		 if (a%2==0)
			 System.out.printf("%d는 짝수입니다.",a);
		 else
			 System.out.printf("%d는 홀수입니다.",a);
		 
		input.close();
		
		
		} 
		
	}
	
