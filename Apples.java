import java.util.Scanner;
import java.text.DecimalFormat;

public class Apples extends Fruit{

	private static double applesperItem = 0.30;
	public static double applesCost ;
	private static double applesAmount;
	
	public void setapplesperItem(double applesperItem)
    {
        this.applesperItem = applesperItem;
    }
	
	public void setapplesAmount(double applesAmount)
    {
        this.applesAmount = applesAmount;
    }
	
	public static void main(String[] args) 
	{
		Scanner applesInput = new Scanner(System.in);
		
		System.out.println("How Many Apples? :");
		
		applesAmount = applesInput.nextDouble();
		
		try
		{				
			applesCost = applesperItem * applesAmount; 					
		}
		 catch (NumberFormatException e) 
		{
	            System.out.println("Please Enter An Integer");
	            Apples.main(args);
		}
		
		
	}
		
	}

