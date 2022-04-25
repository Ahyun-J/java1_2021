/*학번 : 20215247
이름 : 조아현
사용자로부터 높이와 너비를 입력받아 중첩된 반복문을 이용해서 다음의 패턴들을 
출력하는 프로그램 (사각형)*/
package ex;

import java.util.Scanner;

public class ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int h, l;
				Scanner input = new Scanner(System.in);
				
				System.out.print("도형의 높이 : ");
				h = input.nextInt();
				
				System.out.print("도형의 넓이 : ");
				l = input.nextInt();

				for(int i=1;i<=h;i++) {
					for(int j=1;j<=l;j++) {
					System.out.print("*");
				}
				
				System.out.println();

			}
		input.close();
	

	}

}
