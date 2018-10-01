import java.text.DecimalFormat;
import java.util.Scanner;

public class Lemons extends Fruit{

	private static double lemonsperItem = 0.23;
	public static double lemonsCost ;
	private static double lemonsAmount;

	public void setlemonsperItem(double lemonsperItem)
    {
        this.lemonsperItem = lemonsperItem;
    }
	
	public void setlemonsAmount(double lemonsAmount)
    {
        this.lemonsAmount = lemonsAmount;
    }
	
	public static void main(String[] args) 
	{
		Scanner lemonsInput = new Scanner(System.in);
		
		System.out.println("How Many Lemons? :");
		
		lemonsAmount = lemonsInput.nextDouble();
		
		try
		{
				
		lemonsCost = lemonsAmount * lemonsperItem;		
		}
		 catch (NumberFormatException e) 
		{
	            System.out.println("Please Enter An Integer");
	            Lemons.main(args);
		}	
	}
}	
