package ex;

import java.util.Scanner;

public class ex06hint {

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

}
