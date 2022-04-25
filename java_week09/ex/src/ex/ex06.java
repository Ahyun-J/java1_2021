/*학번 : 20215247
이름 : 조아현
while문을 이용해서 사용자가 0을 입력하거나 입력된 총 합이 500이 넘을 경우 프로그램을 
종료하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		Scanner input = new Scanner(System.in);
		
		while(x<=500) {
			System.out.print("누적할 값을 입력하세요 : ");
			x = x+input.nextInt();
			System.out.printf("현재까지의 누적합은 %d입니다.\n",x);
			if(x>=500) {
				System.out.printf("\n총 누적합은 %d입니다.",x);
				break;
			}


		}
		
	}

}

/*
 *힌트
 * package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in,sum = 0;
		Scanner input = new Scanner(System.in);
		
		while(sum<=500) {
			System.out.print("누적할 값을 입력하세요 : ");
			in = input.nextInt();
			
			if(in==0) {
				break;
			}
			sum = in + sum;
			System.out.printf("현재까지의 누적합은 %d입니다.\n",sum);

		}
		System.out.printf("총 누적합은 %d입니다.",sum);
	}

}*/
