/*학번 : 20215247
이름 : 조아현
비트연산자의 사용 예*/

package week05;
//import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ip1 = 210;
		int ip2 = 115;
		int ip3 = 229;
		int ip4 = 188;
		int mask1 = 255;
		int mask2 = 255;
		int mask3 = 255;
		int mask4 = 0;
		
		System.out.printf("ip address: %d . %d . %d . %d \n" , ip1,ip2,ip3,ip4 );
		
		System.out.printf("subnet mask: %d . %d . %d . %d\n" , mask1,mask2,mask3,mask4 );
		
		System.out.print(Integer.toBinaryString(ip1) + "." );
		
		System.out.print(Integer.toBinaryString(ip2) + "." );
		
		System.out.print(Integer.toBinaryString(ip3) + "." );
		
		System.out.print(Integer.toBinaryString(ip4) + "\n" );
		
		System.out.print(Integer.toBinaryString(mask1) + "." );
		
		System.out.print(Integer.toBinaryString(mask2) + "." );
		
		System.out.print(Integer.toBinaryString(mask3) + "." );
		
		System.out.print(Integer.toBinaryString(mask4) + "\n" );
		
		System.out.print("네트워크 ID:");
		
		System.out.print( (ip1 & mask1) + "." );
		
		System.out.print( (ip2 & (mask2<255? 0:mask2)) + "." );
		
		System.out.print( (ip3 & (mask3<255? 0:mask3)) + "." );
		
		System.out.print( ip4 & (mask4<255? 0:mask4));

		

	}

}
