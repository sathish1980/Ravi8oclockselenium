package OOPS;

public class HDFC extends RBI {

	public void interestrate()
	{
		int interestrate=15;
		System.out.println("The interest rate is : "+interestrate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC H = new HDFC();
		H.rules();
		//H.sbiinterestrate();
		H.interestrate();
	}

}
