import java.util.Scanner;

public class Total {
	
	static double[] fruitArray = new double[5];
	
	public static void main(String[] args) 
	{
			
		Bananas BananasObject = new Bananas();
		Lemons LemonsObject = new Lemons();
		Apples ApplesObject = new Apples();
		Pears PearsObject = new Pears();
		Oranges OrangesObject = new Oranges();
		
		Scanner fruitInput = new Scanner(System.in);
		
		System.out.println("What would you like? Type a for Apples, b for Bananas, l for lemons, o for oranges & p for pears");
		
		String fruitObject = fruitInput.next().toLowerCase();
		
		if (fruitObject.equals("a"))
		{
			ApplesObject.main(args);
			Total.fruitArray[0] = Apples.applesCost;
			CheckandCount(args);
			
		}
		
		else if (fruitObject.equals("b"))
		{
			BananasObject.main(args);
			Total.fruitArray[1] = Bananas.bananasCost;
			CheckandCount(args);
		}
		
		else if (fruitObject.equals("l"))
		{
			LemonsObject.main(args);
			Total.fruitArray[2] = Lemons.lemonsCost;
			CheckandCount(args);
		}
		else if (fruitObject.equals("o"))
		{
			OrangesObject.main(args);
			Total.fruitArray[3] = Oranges.orangesCost;
			CheckandCount(args);
		}
		else if (fruitObject.equals("p"))
		{
			PearsObject.main(args);
			Total.fruitArray[4] = Pears.pearsCost;
			CheckandCount(args);
		}
		
		else 
		{
			System.out.println("Please Type in valid input: Type y for Yes & n for No");
			main(args);
		}
		
		
	}
	
	public static void CheckandCount(String[] args1) 
	{
		Scanner shopperInput = new Scanner(System.in);
		
		System.out.println("Would you like to continue shopping? Type y for Yes & n for No");
		
		String shopperResult = shopperInput.next().toLowerCase();
		
			if (shopperResult.equals("n"))
			{
								
				double totalCost = 0;
				int i =0;
				
					for(i=0; i<5; i++)
						{
						totalCost = Math.round((totalCost + Total.fruitArray[i])*100.0)/100.0;					
						}
					
					if ((totalCost*100)%10 ==0)
					{
						System.out.println("Total price is " +totalCost+"0");
					}
				
					else
					{
						System.out.println("Total price is " +totalCost);
					}
			}
			else if (shopperResult.equals("y"))
			{
				main(args1);
				
			}
			
			else 
			{
				System.out.println("Please Type in valid input: Type y for Yes & n for No");
				CheckandCount(args1);
			}
	}

}



