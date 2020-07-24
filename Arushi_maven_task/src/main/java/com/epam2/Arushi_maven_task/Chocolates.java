package com.epam2.Arushi_maven_task;

public class Chocolates extends NewYearsGift implements Comparable<Chocolates>{
	public Chocolates() {
		// TODO Auto-generated constructor stub
	}
	public Chocolates(int weight, int giftNumber)
	{
		this.weight=weight;
		this.giftNumber=giftNumber;
	}
	@Override
	public int compareTo(Chocolates o) {
		// TODO Auto-generated method stub
		if(weight<=o.weight)  
			return 1;  
			else  
			return -1;  
		
	}

}
