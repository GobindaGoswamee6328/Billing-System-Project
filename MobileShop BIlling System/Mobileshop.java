
import java.util.*;
import java.io.FileOutputStream;

class Mobileshop{
         
		 public static void main(String[] args)
		 
		{
			 Scanner g1 = new Scanner(System.in);
		try{	 
			 for (int a = 0; a<100; a++)
				 
			 
			{
                System.out.println(" * Welcome To Our Mobileshop * ");
				System.out.println();
				
                System.out.println("1. Buy Accessories");
                System.out.println("2. Leave");
				
                 
				System.out.print("Choose The Option : ");
                int option1 = g1.nextInt();
								
				  
				if(option1 == 1)
				{
                   
				   Accessories1  A1 = new Accessories1();
                   A1.AccessoriesName();
				   
				   Accessories2  A2 = new Accessories2();
                   A2.AccessoriesName();
				   
				   Accessories3  A3 = new Accessories3();
                   A3.AccessoriesName();
				   
				   Accessories4  A4 = new Accessories4();
                   A4.AccessoriesName();
				   
				   Accessories5  A5 = new Accessories5();
                   A5.AccessoriesName();
				   
				   Accessories6  A6 = new Accessories6();
                   A6.AccessoriesName();
				   
				   Accessories7  A7 = new Accessories7();
                   A7.AccessoriesName();
				   
				   Accessories8  A8 = new Accessories8();
                   A8.AccessoriesName();
				   
				   Accessories9  A9 = new Accessories9();
                   A9.AccessoriesName();
				   
				   Accessories10  A10 = new Accessories10();
                   A10.AccessoriesName();
				   
				   Accessories11  A11 = new Accessories11();
                   A11.AccessoriesName();
				   
				   Accessories12  A12 = new Accessories12();
                   A12.AccessoriesName();
				   System.out.println();
				   



				   A1.AccessoriesName();
				   System.out.println("This Rate is : " + A1.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q1 = g1.nextInt();
				   int balance1 = A1.AccessoriesRate() * q1;
				   System.out.println("Rate : " + balance1);
				   System.out.println();


                   A2.AccessoriesName();
				   System.out.println("This Rate is : " + A2.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q2 = g1.nextInt();
				   int balance2 = A2.AccessoriesRate() * q2;
				   System.out.println("Rate : " + balance2);
				   System.out.println();
				   
				   
				   A3.AccessoriesName();
				   System.out.println("This Rate is : " + A3.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q3 = g1.nextInt();
				   int balance3 = A3.AccessoriesRate() * q3;
				   System.out.println("Rate : " + balance3);
				   System.out.println();
				   
				   
				   A4.AccessoriesName();
				   System.out.println("This Rate is : " + A4.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q4 = g1.nextInt();
				   int balance4 = A4.AccessoriesRate() * q4;
				   System.out.println("Rate : " + balance4);
				   System.out.println();


				   A5.AccessoriesName();
				   System.out.println("This Rate is : " + A5.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q5 = g1.nextInt();
				   int balance5 = A5.AccessoriesRate() * q5;
				   System.out.println("Rate : " + balance5);
				   System.out.println();


				   A6.AccessoriesName();
				   System.out.println("This Rate is : " + A6.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q6 = g1.nextInt();
				   int balance6 = A6.AccessoriesRate() * q6;
				   System.out.println("Rate : " + balance6);
				   System.out.println();
				   
				   
				   A7.AccessoriesName();
				   System.out.println("This Rate is : " + A7.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q7 = g1.nextInt();
				   int balance7 = A7.AccessoriesRate() * q7;
				   System.out.println("Rate : " + balance7);
				   System.out.println();
				   
				   
				   A8.AccessoriesName();
				   System.out.println("This Rate is : " + A8.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q8 = g1.nextInt();
				   int balance8 = A8.AccessoriesRate() * q8;
				   System.out.println("Rate : " + balance8);
				   System.out.println();
				   
				   
				   A9.AccessoriesName();
				   System.out.println("This Rate is : " + A9.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q9 = g1.nextInt();
				   int balance9 = A9.AccessoriesRate() * q9;
				   System.out.println("Rate : " + balance9);
				   System.out.println();
				   
				   
				   A10.AccessoriesName();
				   System.out.println("This Rate is : " + A10.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q10 = g1.nextInt();
				   int balance10 = A10.AccessoriesRate() * q10;
				   System.out.println("Rate : " + balance10);
				   System.out.println();
				   
				   
				   A11.AccessoriesName();
				   System.out.println("This Rate is : " + A11.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q11 = g1.nextInt();
				   int balance11 = A11.AccessoriesRate() * q11;
				   System.out.println("Rate : " + balance11);
				   System.out.println();

				   
				   A12.AccessoriesName();
				   System.out.println("This Rate is : " + A12.AccessoriesRate() + " " + "BDT.");
                   System.out.print("Enter your quantity : ");				   
				   int q12 = g1.nextInt();
				   int balance12 = A12.AccessoriesRate() * q12;
				   System.out.println("Rate : " + balance12);
				   System.out.println();




                   int totalbill = balance1+balance2+balance3+balance4+balance5+balance6+balance7+balance8+balance9+balance10+balance11+balance12;
				   int totalitem = q1+q2+q3+q4+q5+q6+q7+q8+q9+q10+q11+q12;
				   System.out.println("Total Item : " + totalitem + " " + "pis");
				   System.out.println("Total Bill : " + totalbill + " " + "BDT.");
				   System.out.print("Get Discount : ");
				   double discount = g1.nextDouble();
				   double bill = totalbill - discount;
				   System.out.println("Total Bill : " + bill);
				   System.out.print("Enter Customer Name   : ");
				   String name = g1.next();
				   System.out.print("Enter Customer Number : ");
				   String number = g1.next();

				   FileOutputStream fio = new FileOutputStream("information.txt");
				   byte ga[] = name.getBytes();
				   byte gb[] = number.getBytes();
				   fio.write(ga);
				   fio.write(gb);
				   fio.close();
				   System.out.println();
				   
				 
				}	
                  else 

                     System.out.println("Thank You, Sir");					  
			}
		} 
		
		catch(Exception pro)
		
		{
			System.out.println(pro);
		}
			 
		}
}