import java.text.DecimalFormat;
import java.util.Scanner;

public class Oranges extends Fruit{

	private static double orangesperItem = 0.27;
	public static double orangesCost ;
	private static double orangesAmount;
	
	public void setorangesperItem(double orangesperItem)
    {
        this.orangesperItem = orangesperItem;
    }
	
	public void setorangesAmount(double orangesAmount)
    {
        this.orangesAmount = orangesAmount;
    }
	
	public static void main(String[] args) 
	{
		Scanner orangesInput = new Scanner(System.in);
		
		System.out.println("How Many Oranges? :");
		
		orangesAmount = orangesInput.nextDouble();
		
		try
		{				
			orangesCost = orangesAmount * orangesperItem;					
		}
		 catch (NumberFormatException e) 
		{
	            System.out.println("Please Enter An Integer");
	            Oranges.main(args);
		}
				
	
	}
}
