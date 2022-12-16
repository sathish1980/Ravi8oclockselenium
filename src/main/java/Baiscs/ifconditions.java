package Baiscs;

public class ifconditions {
	
	public void signals(String color,String vehicle,String patient)
	{
		if (color=="Red")
		{
			System.out.println("please stop your vehicle");
			System.out.println("dont blow horn");
			if(vehicle == "ambulance")
			{
				if(patient=="Yes")
				{
				System.out.println("you are ambulance ,please go a head");
				System.out.println("give a way for ambulance");
				}
			}
		}
		else if (color=="Orange")
		{
			System.out.println("please start your engine");
			System.out.println("good to go in 5 sec");
		}
		else if (color=="Green")
		{
			System.out.println("Good to go now");
			System.out.println("have a safe drive");
		}
		else
		{
			System.out.println("you have given incorrect color");
		}
	}
	
	public void switchconditions(String gender)
	{
		switch(gender)
		{
			case "Male":
				System.out.println("You are male");
				break;
			case "FeMale":
				System.out.println("You are female");
				break;
			case "Transgender":
				System.out.println("You are transgender");
				break;
			default:
				System.out.println("This is not a valid keyword");
				break;
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifconditions i = new ifconditions();
		i.signals("Red","ambulance","No");
		i.switchconditions("FeMale");
	}

}
