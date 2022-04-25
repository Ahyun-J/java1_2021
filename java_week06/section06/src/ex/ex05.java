/*학번 : 20215247
이름 : 조아현
사용자로부터 2차 방정식의 계수 a , b , c를 실수로 입력받아 2차 방정식의 근
을 계산 출력하는 프로그램*/

package ex;

import java.util.Scanner;

public class ex05 {
	public static void main(String[]agrs) {
 
		//char i = 'i';
		double a,b,c,D,dd, bb;
		
		Scanner input = new Scanner(System.in);
		System.out.print("2차 방정식의 a를 입력해 주세요(실수) : ");
		a = input.nextDouble();
		
		System.out.print("2차 방정식의 b를 입력해 주세요(실수) : ");
		b = input.nextDouble();
		
		System.out.print("2차 방정식의 c를 입력해 주세요(실수) : ");
		c = input.nextDouble();
		
		D = (b*b)-4*a*c;
		dd = Math.sqrt(D); // 루트 구하는 방법 찾아 보았습니다.
		bb = Math.sqrt((4*a*c)-(b*b));
		
		if(D>0)
			System.out.printf("2차 방정식의 근은 %.1f,%.1f입니다.",(-b+dd)/(2*a),(-b-dd)/(2*a));
		else if(D==0)
			System.out.printf("2차 방정식의 근은 %f입니다.",-b/(2*a));
		else if(D<0)
			System.out.printf("2차 방정식의 근은 %fi, %fi 입니다.",(-b+bb)/(2*a),(-b-bb)/(2*a));
		
		input.close();
		
		
	}

}
