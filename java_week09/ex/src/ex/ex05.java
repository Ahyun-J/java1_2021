/*학번 : 20215247
이름 : 조아현
 키보드로부터 1부터 9 사이의 정수를 입력받아 해당 구구단을 출력하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("구구단 단을 입력하세요 : ");
		c = input.nextInt();
		
		for(i=1;i<=9;i++) {
			System.out.printf("%d * %d = %2d\n",c,i,c*i);
		}
		input.close();		
	}
	
}

