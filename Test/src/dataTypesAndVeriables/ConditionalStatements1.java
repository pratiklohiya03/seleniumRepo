package dataTypesAndVeriables;

import java.util.Scanner;

public class ConditionalStatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cet;
		int aieee;
		int c = 40;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your score for cet");
		cet = sc.nextInt();
		System.out.println("Enter your score for aieee");
		aieee=sc.nextInt();
		
		if (cet>80 || aieee>10)
		{
		System.out.println("you are elligible for egineering");	
		}
			else 
		{
		System.out.println("bhag idhar se");	
		}
		
		
				
	}

}
