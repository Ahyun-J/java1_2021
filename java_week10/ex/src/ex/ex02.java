/*학번 : 20215247
이름 : 조아현
사용자로부터 0이 아닌 정수가 입력될 때 까지이 합과 평균을 계산하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, i =1;
		int  sum = 0;
		double avg = 0;
		
		do {
			System.out.print("정수입력 : ");
			a = input.nextInt();
			if (a == 0) break;
			sum+=a;
			avg=(double)sum/i;
			System.out.printf("-> 합:%s 평균:%s \n",sum,avg);
			i++;
		}while(true);
		
		System.out.print("-> 종료 ");
		input.close();
	}

}
