package Abstractandinterface;

public abstract class abstractclass {

	public void percentage(int mark1,int mark2,int mark3)
	{
		int totalmarks=mark1+mark2+mark3;
		int overallmark=300;
		double percentage=(totalmarks-overallmark);
		System.out.println("your total percentage is : "+percentage);
		
	}
	
	public abstract void grade(int mark);
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass a = new abstractclass();
		a.percentage(45, 75, 55);
	}*/

}
