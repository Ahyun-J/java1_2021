/*�й� : 20215247
�̸� : ������
1���� 50���� ���ڸ� for������ ����ϵ� if ���� �̿� 3�� ��� �Ǵ� 5�� ����� * �� 
����ϴ� ���α׷�*/

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


