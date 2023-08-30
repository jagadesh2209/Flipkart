package Project2;

import java.util.Arrays;
import java.util.Scanner;

import demoPractice.Array;

public class TestMobile {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Mobile[] arr= {new Mobile("Redmi", 1000.5,5 ),new Mobile("Oppo", 15000, 8),new Mobile("Vivo", 18000, 6)
				
				,new Mobile("Kachada", 900, 2),new Mobile("Nokia", 1500, 4)};
		for(Object obj:arr)
		{
			System.out.println(obj);
		}
		System.out.println("***********************");
		boolean flag=true;
		while(flag)
		{
			System.out.println("1.Price Heighest to low");
			System.out.println("2.Price Low to Heighest");
			System.out.println("3.Based on Brand");
			System.out.println("4.Exit");
			int count=sc.nextInt();
			switch (count) 
			{
			case 1:
				Arrays.sort(arr);
				for(Mobile obj:arr)
				{
					System.out.println(obj);
				}
				break;
			
			case 2:
				Arrays.sort(arr,new SortByPrice());
				for(Mobile obj:arr)
				{
					System.out.println(obj);
				}
				break;
			
			case 3:
				Arrays.sort(arr,new SortByBrand());
				for(Mobile obj:arr)
				{
					System.out.println(obj);
				}
				break;
				
			case 4:
				System.out.println("Are you sure to exit then press 1");
				int ext=sc.nextInt();
				if(ext==1)
				{
					System.out.println("Thank you");
					flag =false;
				}
				break;
				
			default:
				System.out.println("Invalid number");
				break;
			}
		}
	}
}
