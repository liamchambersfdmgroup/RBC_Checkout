import java.text.DecimalFormat;
import java.util.Scanner;

public class Pears extends Fruit{

	private static double pearsperItem = 0.35;
	public static double pearsCost ;
	private static double pearsAmount;
	
	public void setpearsperItem(double _pearsperItem)
    {
        this.pearsperItem = _pearsperItem;
    }
	
	public void setpearsAmount(double _pearsAmount)
    {
        this.pearsAmount = _pearsAmount;
    }
		
	public static void main(String[] args) 
	{
		Scanner pearsInput = new Scanner(System.in);
		
		System.out.println("How Many Pears? :");
		
		pearsAmount = pearsInput.nextDouble();
		
		try
		{				
			pearsCost = pearsperItem * pearsAmount; 				
		}
		 catch (NumberFormatException e) 
		{
	            System.out.println("Please Enter An Integer");
	            Pears.main(args);
		}
						
	}
}
