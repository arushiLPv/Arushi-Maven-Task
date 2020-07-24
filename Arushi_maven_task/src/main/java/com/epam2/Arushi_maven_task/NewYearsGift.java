package com.epam2.Arushi_maven_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewYearsGift {
	int weight;
	int giftNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ArrayList<Chocolates> chocolates=new ArrayList<Chocolates>();  
		ArrayList<Sweets> sweets=new ArrayList<Sweets>();  
		int giftCount=0;
		int candiesCount=0;
		//I have considered gifts greater than weight 10 as sweets and less than 10 as chocolates
		//and if weight is less than 5 it is under chocolates only but will be counted as candy also.
		System.out.println("Enter weight of the gifts");
		int weightOfTheGift=sc.nextInt();
		while(weightOfTheGift!=0)
		{
			if(weightOfTheGift<10)
			{
				giftCount++;
				chocolates.add(new Chocolates(weightOfTheGift,giftCount));  
				 if(weightOfTheGift<5)
					 candiesCount++;
			}
			else
			{
				giftCount++;
				 sweets.add(new Sweets(weightOfTheGift,giftCount));  

			}
			System.out.println("Enter weight of the gifts");
			weightOfTheGift=sc.nextInt();
		}
		//sorting chocolates by their weight
		Collections.sort(chocolates);
		System.out.println("The smallest to biggest chocolate is as follows along with their gift number");
		for(Chocolates choco: chocolates)
		{
			System.out.println("Weight : "+ choco.weight+" Gift number: "+choco.giftNumber);
		}
		if(candiesCount!=0)
		{
			System.out.println("There are "+ candiesCount+" candies.");
		}
		else
		{
			System.out.println("There are no candies.");
		}
		sc.close();

	}

}
