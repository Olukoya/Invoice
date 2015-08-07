
public class LineItemInvoice
	{
	private int code;
	private boolean taxable;
	private double price, tax, taxableSub, untaxableSub;
	
		public LineItemInvoice ()
		{
		code = 0;
		taxable = true;
		price = 0;
		tax = 0;
		taxableSub = 0;
		untaxableSub = 0;

		}
	
		public void setCode (int code)
		{
		this.code = code;
		}
	
		public int getCode ()
		{
		return code;
		}
	
		public void setTaxStatus (boolean taxable)
		{
		this.taxable = taxable;
		}
	
		public boolean getTaxStatus ()
		{
		return taxable;
		}
	
		public void setTax (double tax)
		{
		this.tax = tax;
		}
	
		public double getTax ()
		{
		return tax;
		}
	
		public void setPrice (double price)
		{
		this.price = price;
		}
	
		public double getPrice ()
		{
		return price;
		}
	
		public void setTaxableSub (double taxableSub)
		{
		this.taxableSub = taxableSub;
		}
		
		public double getTaxableSub ()
		{
		return taxableSub*tax/100;
		}
	
		public void setUntaxableSub (double untaxableSub)
		{
		this.untaxableSub = untaxableSub;
		}
		
		public double getUntaxableSub ()
		{
		return untaxableSub;
		}
			
	}
