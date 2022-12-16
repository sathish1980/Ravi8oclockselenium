package Abstractandinterface;

public class Gradecalcualtion extends abstractclass implements interface1 {
	
	@Override
	public void grade(int mark) {
		if(mark>95)
		{
			System.out.println("You are grade A");
		}
		else if(mark>85)
		{
			System.out.println("You are grade B");
		}
		else if(mark >70)
		{
			System.out.println("You are grade C");
		}
		else
		{
			System.out.println("You are grade D");
		}
		
		
	}
	
	public void schoolename()
	{
		System.out.println("CKMHSS");
	}
	
	@Override
	public void tution() {
		System.out.println("You have to pay Rs .50000 per year");
		
	}

	@Override
	public void fees() {
		// TODO Auto-generated method stub
		System.out.println("You have to academic fees Rs .75000 per year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass G = new Gradecalcualtion();
		interface1 G1 = new Gradecalcualtion();
		//G.schoolename();
		G.percentage(34,56,77);
		G.grade(99);
		G1.tution();
		G1.fees();
	}

	

	

}
