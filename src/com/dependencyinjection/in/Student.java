package com.dependencyinjection.in;

public class Student {
	private int id;
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat=mathCheat;
		
	}
	
	public void Cheating()
	{
		mathCheat.cheating();
		System.out.println("My id is : "+id);
	}
	

}
