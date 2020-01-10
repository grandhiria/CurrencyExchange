import java.util.Scanner;

public class CovertYourCurrencyHere {
	public static void main(String args[])
	{

		new ExchangeCurrency().listItems();
	    @SuppressWarnings("resource")
		Scanner currency = new Scanner(System.in);  
	    
	    System.out.println("Enter the currency you have:");
	    String MyCurrency = currency.nextLine();  
	    System.out.println("Enter the currency you want to convert: ");
	    String ConvCurrency = currency.nextLine(); 
	    
	    ExchangeCurrency obj=new ExchangeCurrency(1,MyCurrency.toUpperCase(), ConvCurrency.toLowerCase());
	    obj.handleMoney(obj);
	    	
		
		
	}
	
}
