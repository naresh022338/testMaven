package com.psl.aop;

public class Performer {
	
	public void getUp(){
		System.out.println("performer gets up");
	}
	public void breakfast(){
		System.out.println("eats breakfst");
	}
	
	public void addressAudience(){
		System.out.println("performer addresses audience");
	}
	
	
	public void perform() throws Exception{
		System.out.println("performer performs a song");
		throw new Exception("Raining");
	
	}
	
	public void givesThanks(){
		System.out.println("vote of thanks");
	}
	public void goesHome(){
		System.out.println("concert over");
	}
}
