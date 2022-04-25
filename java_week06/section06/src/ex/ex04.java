/*학번 : 20215247
이름 : 조아현
사용자로부터 키와 몸무게를 입력받아 표준체중을 계산한 후 비만도를 계산하고 
비만 정도에 따라 비만여부를 출력하는 판단하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex04 {
	public static void main(String[]agrs) {

	double x,y,z,d;
	// String = null;
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("키를 입력하세요 : ");
	x = input.nextDouble();
	
	System.out.printf("몸무게를 입력하세요 : ");
	y = input.nextDouble();
	
	z = (x-100)*0.9;
	d = (y-z)/z*100;
	
	if(d<20)
		System.out.println("비만도는 정상입니다.");
	else if(20<=d && d<30)
		System.out.println("비만도는 경도비만입니다.");
	else if(30<=d && d<50)
		System.out.println("비만도는 중등도비만입니다.");
	else
		System.out.println("비만도는 고도비만 입니다.");
	
	input.close();
	} 
		
}

