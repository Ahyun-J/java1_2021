/*학번 : 20215247
이름 : 조아현
사용자에게 두 개의 숫자를 입력하도록 하여 가장 작은 수, 가장 큰 수, 합계 
또는 평균 값 중 하나를 선택하여 계산하는 메뉴기반 프로그램*/

package ex;

import java.util.Scanner;

public class ex06 {
	public static void main(String[]args) {
	
	int x, y, m ;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("두 정수를 입력하세요 : ");
	
	x = input.nextInt();
	y = input.nextInt();
	
	System.out.println("메뉴");
	System.out.println("1. 작은수");
	System.out.println("2. 큰수");
	System.out.println("3. 합계");
	System.out.println("4. 평균");
	System.out.println("5. 종료");
	System.out.print("메뉴를 선택하세요 : ");
	
	m = input.nextInt();
	
	switch(m) {
	case 1 :
		if (x>y)
			System.out.printf("\n결과 : %d", y);
		else 
			System.out.printf("\n결과 : %d", x);
		break;
		
	case 2 :
		if (x<y)
			System.out.printf("\n결과 : %d", y);
		else 
			System.out.printf("\n결과 : %d", x);
		break;
		
	case 3 :
		System.out.printf("\n결과 : %d", x+y);
		break;
		
	case 4 :
		System.out.printf("\n결과 : %d", (x+y)/2);
		break;
		
	case 5 :
		System.out.print("\n종료합니다.");
		break;
		
	default :
			System.err.printf("\n메뉴선택오류");
			
		input.close();
			
		}
	
	
	}

}

