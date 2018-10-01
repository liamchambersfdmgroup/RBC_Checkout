import java.text.DecimalFormat;
import java.util.Scanner;

public class Bananas extends Fruit{
	
	private static double bananasperItem = 0.25;
	public static double bananasCost ;
	private static double bananasAmount;

	public void setbananasperItem(double bananasperItem)
    {
        this.bananasperItem = bananasperItem;
    }
	
	public void setbananasAmount(double bananasAmount)
    {
        this.bananasAmount = bananasAmount;
    }
		
	public static void main(String[] args) 
	{
		Scanner bananasInput = new Scanner(System.in);
		
		System.out.println("How Many Bananas? :");
		
		bananasAmount = bananasInput.nextDouble();
		
		try
		{				
				bananasCost = bananasAmount * bananasperItem;			
		}
		 catch (NumberFormatException e) 
		{
	            System.out.println("Please Enter An Integer");
	            Bananas.main(args);
		}
							
	}
}
