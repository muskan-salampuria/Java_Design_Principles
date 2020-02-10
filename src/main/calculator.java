package main;
import mathOperations.*;
import java.util.*;

public class calculator {
	public static void main(String args[])
	{
		int choice=0;
		operations a=new addition();
		operations s=new substraction();
		operations m=new multiplication();
		operations d=new division();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float x=scan.nextFloat();
		System.out.println("Enter the second number: ");
		float y=scan.nextFloat();
		do
		{
		System.out.println("\nWhich operaion do you want to perform:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division \nEnter your choice:");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("\n----------------------------------------------\nThe result is : "+a.Calc(x, y)+"\n----------------------------------------------\n");
			break;
		case 2:
			System.out.println("\n----------------------------------------------\nThe result is : "+s.Calc(x, y)+"\n----------------------------------------------\n");
			break;
		case 3:
			System.out.println("\n----------------------------------------------\nThe result is : "+m.Calc(x, y)+"\n----------------------------------------------\n");
			break;
		case 4:
			System.out.println("\n----------------------------------------------\nThe result is : "+d.Calc(x, y)+"\n----------------------------------------------\n");
			break;
		default:
			System.out.println("\n----------------------------------------------\nInvalid Choice\n----------------------------------------------\n");
			
		}
		}while(choice<5);
		scan.close();
	}
}
