package controlstatements;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) 
	{
		/*--- Creating object of Scanner class ----*/
		Scanner sc = new Scanner(System.in);
		/*-----------------------------------------*/
		/*------- Creating two variable to store two number ------*/
		int num1, num2;
		int choice; // variable to decide whether operations should continue or not
		/*--------------------------------------------------------*/
		do
		{
			/*----- input of number through keyboard ------*/
			System.out.print("Enter first number : ");
			num1 = sc.nextInt();
			System.out.print("Enter Second Number : ");
			num2 = sc.nextInt();
			/*----------------------------------------------*/
			/*----- Displaying Menu of Operations to the User ---------*/
			System.out.println("----------------------------------------------");
			System.out.println("----------- Numeric Calculation --------------");
			System.out.println("----------------------------------------------");
			System.out.println(" 1. Addition");
			System.out.println(" 2. Difference");
			System.out.println(" 3. Product");
			System.out.println(" 4. Division");
			System.out.println("----------------------------------------------");
			/*--------------------------------------------------------------------*/
			/*---------- Asking the User to select any one operation ----------*/
			System.out.print("Select any one operation : ");
			int operation = sc.nextInt();
			System.out.println("------------------------------------");
			/*-----------------------------------------------------------------*/
			/*--------- Performing the operation as per selection ------------*/
			switch(operation)
			{
			case 1 : System.out.println("--------- Addition Operation --------");
					 System.out.println("Sum of "+num1+" and "+num2+" is : "+(num1+num2));
				 break;
			case 2: System.out.println("--------- Difference Operation --------");
		 			System.out.println("Difference between "+num1+" and "+num2+" is : "+(num1-num2));
		 		break;
			case 3: System.out.println("--------- Product Operation --------");
		 			System.out.println("Product of "+num1+" and "+num2+" is : "+(num1*num2));
		 		break;
			case 4: System.out.println("--------- Division Operation --------");
					System.out.println("On dividing "+num1+" by "+num2);
					System.out.println("Quotient = "+(num1/num2));
					System.out.println("Remainder : "+(num1%num2));
		 		break;
			default: System.out.println("Invalid Operation");
			}
			System.out.println("---------------------------------------------------------------");
			/*----- Asking the user to continue or terminate ----*/
			System.out.print("Press 0 to exit or anyother number to continue :");
			choice = sc.nextInt();
			System.out.println("--------------------------------------------------");
		}while(choice!=0);
	}
}
