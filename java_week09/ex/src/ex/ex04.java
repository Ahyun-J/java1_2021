/*학번 : 20215247
이름 : 조아현
1부터 50까지 숫자를 for문으로 출력하되 if 문을 이용 3의 배수 또는 5의 배수는 * 로 
출력하는 프로그램*/

package ex;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ;
		for(i=1;i<=50;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print("* ");
				continue;
			}
				System.out.printf("%d ", i);
			}
			
		}

	}


