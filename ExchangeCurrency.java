import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class ExchangeCurrency implements Tradeable{

int id;
String myCurrency, desiredCurrency;

	
	public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getMyCurrency() {
	return myCurrency;
}


public void setMyCurrency(String myCurrency) {
	this.myCurrency = myCurrency;
}


public String getDesiredCurrency() {
	return desiredCurrency;
}


public void setDesiredCurrency(String desiredCurrency) {
	this.desiredCurrency = desiredCurrency;
}


	public ExchangeCurrency(int id, String myCurrency, String desiredCurrency) {
	super();
	this.id = id;
	this.myCurrency = myCurrency;
	this.desiredCurrency = desiredCurrency;
}


	public ExchangeCurrency() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public BigDecimal getExchangeRate() {
		// TODO Auto-generated method stub
		if (myCurrency.equals("SGD") && desiredCurrency.equals("USD"))
		{
			return new BigDecimal("0.742164");
		}
		else
		return null;
	}


	@Override
	public BigDecimal getExchangedAmount(BigDecimal amount) {
		
		return amount.multiply(getExchangeRate());
	}

	public void handleMoney(ExchangeCurrency obj)
	{
		if(obj.getMyCurrency().equals("SGD") && obj.getDesiredCurrency().equals("USD") )
	    {
			
			obj.convertSGDtoUSD(obj);
	    }
	    else
	    	System.out.println("Currency not available");
	}

	public void convertSGDtoUSD(ExchangeCurrency obj)
	{
		Scanner currency = new Scanner(System.in);  
    	System.out.println("The exchange rate is "+ obj.getExchangeRate() +" i.e. 1 SGD equals "+obj.getExchangeRate() +" . Do you want to proceed? Type Y or No");
    	String response = currency.nextLine();
    	
    	if(response.equals("Y"))
    	{
    		System.out.println("How much money do you want to convert?");
    		int money = Integer.parseInt(currency.nextLine());
    		System.out.println("You will be getting "+ obj.getExchangedAmount(new BigDecimal(money)) + " USD");
    	}
    	else
    		System.out.println("Alright. Next time");
    	currency.close();
	}
	
	public void listItems()
	{
		LinkedList<String> acceptable=new LinkedList<>();
		LinkedList<String> dispensable=new LinkedList<>();
		acceptable.add("SGD");
		dispensable.add("USD");

	    System.out.println("List of acceptable currencies here : "+acceptable);
	    System.out.println("List of dispensable currencies here: "+dispensable);
		}

}