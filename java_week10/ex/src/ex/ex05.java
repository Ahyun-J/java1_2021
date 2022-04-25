/*학번 : 20215247
이름 : 조아현
사용자로부터 두 수를 입력받아 최대 공약수를 구하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,x,y,r;
		
		System.out.print("두 수를 입력하세요 : ");
		a = input.nextInt();
		b = input.nextInt();
		
		x = (a>b)? a:b;
		y = (a>b)? b:a;
		
		while(y != 0) {
			r = x%y;
			x=y;
			y=r;
		}
System.out.printf("두 수의 최대 공약수는 %d", x);
input.close();
	}

}
