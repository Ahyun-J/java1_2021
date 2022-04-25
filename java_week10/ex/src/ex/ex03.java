/*학번 : 20215247
이름 : 조아현
이중 반복문( 중첩 for문 )과 조건문 if와 continue를 이용해서 사용자로부터 입력받은 
숫자까지의 모든 숫자 중 소수(1과 자기 자신 만으로만 나누어 떨어지는 1보다 큰 양의 정수)만을 
출력하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0;
		
		System.out.print("출력 최대값 입력 : ");
		a = input.nextInt();
		System.out.printf("소수 : ");
		for(int i=1;i<=a;i++) {
			int count = 0;
			for( int j = i; j>=1;j--) {
				if(i%j==0)
					count++;
			}
			if(count == 2)
				System.out.printf("%d ",i);
		}

	input.close();}

}
