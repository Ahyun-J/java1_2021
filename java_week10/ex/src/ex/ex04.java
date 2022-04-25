/*학번 : 20215247
이름 : 조아현
피보나치수열을 출력하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int f0 = 0;
		int f1 =1;
		int a, q;
		int j =0;
		
		System.out.print("피보나치수열의 마지막 항을 입력하시오 : ");
		a = input.nextInt();
		System.out.printf("피보나치수열 : ");
		
		for(int i=0;i<a-1;i++) {

			if(i<2) {
			System.out.printf("%d, ",i);
			continue;
			}
			
			q = f0 + f1;
			System.out.printf("%d, ",q);
			f0 = f1;
			f1 = q;
			j++;
		}
		q = f0 + f1;
		if (j<a) {
			System.out.printf("%d ",q);}
		
		input.close();	

	}}
