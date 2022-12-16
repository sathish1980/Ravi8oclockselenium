package Intermediate;

import Baiscs.Firstclass;

public class thirdclass extends Firstclass{

	//Firstclass f1 = new Firstclass();
	public void implementation()
	{
		System.out.println("thid class implementation");
		System.out.println(age);
		add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thirdclass t = new thirdclass();
		t.implementation();
	}

}
