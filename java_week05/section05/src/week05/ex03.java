/*�й� : 20215247
�̸� : ������
�� ���� �Է¹޾� ���迬���� ������ ����� ����ϴ� ���α׷� */

package week05;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ��� : ");
		
		x = input.nextInt();
		y = input.nextInt();
		
		System.out.format("%d<%d �� %b \n",x,y,x<y);
		System.out.format("%d>%d �� %b \n",x,y,x>y);
		System.out.format("%d<=%d �� %b \n",x,y,x<=y);
		System.out.format("%d>=%d �� %b \n",x,y,x>=y);
		System.out.format("%d==%d �� %b \n",x,y,x==y);
		System.out.format("%d!=%d �� %b \n",x,y,x!=y);
		System.out.format("!(%d!=%d) �� %b \n",x,y,!(x!=y));
		
		input.close();
		
		

	}

}
