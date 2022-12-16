package OOPS;

public class SBI extends RBI {

	public void sbiinterestrate() 
	{
		int interestrate=13;
		System.out.println("the interest percentage is: "+interestrate);
	}
	
	public void rules()
	{
		System.out.println("Weekends are not holidays");
		System.out.println("Commision rate should be <10%");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		s.rules();
		s.sbiinterestrate();
	}

}
