package week11;

class creditcard{
	public long cardnumber;
	public String owner;
}

public class cardexample {
	
	public static void main(String[]arg) {
		creditcard cc = new creditcard();
		cc.cardnumber = 1234_5678_1233_2345L;
		cc.owner = "kim";
		System.out.println("ī���ȣ : "+cc.cardnumber);
		System.out.println("ī������� : "+cc.owner);

		
	}

}
