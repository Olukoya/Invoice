	import java.text.NumberFormat;
import java.util.Scanner;

	public class LineItemApp
	{
	    public static void main(String args[])
	    {
	        System.out.println(
	            "Welcome to the Invoice Application");
	        System.out.println();
	        
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        double tax=0, taxableSub=0, untaxableSub=0, taxAmount=0, grandTotal=0;
	        String taxable = "y";
	        LineItemInvoice item = new LineItemInvoice ();
	        
	        System.out.print("Enter the tax: ");
            tax = sc.nextDouble();
            item.setTax(tax);

	        while (choice.equalsIgnoreCase("y"))
	        {
	            // get the input from the user
	            System.out.print("Enter the item code: ");
	            @SuppressWarnings("unused")
				int code = sc.nextInt();
	            
	            System.out.print("Enter the item price: ");
	            double price = sc.nextDouble();
	            	if (price >= 0 && price < 1000)
	            	{
	            System.out.print("Is this item taxable? (Y/N) ");
	            taxable = sc.next();
	            
	            sc.nextLine();
	            
	            if (taxable.equalsIgnoreCase("y"))
	            {
	            	taxableSub += price;
	            }
	            else
	            {
	            	untaxableSub += price;
	            }  	            
	            System.out.println();
	            item.setTaxableSub(taxableSub);
	            item.setUntaxableSub(untaxableSub);
	            // see if the user wants to continue
	            
	            System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	            	}
	            	else
	            	{
	            	System.out.println("Not a valid choice!\n Please try again...\n");	
	            	}
	        }
	                    
	            taxAmount = item.getTaxableSub();
	            grandTotal = taxableSub + untaxableSub + taxAmount;
	            
	            NumberFormat taxed = NumberFormat.getCurrencyInstance();
	            String taxedString = taxed.format(taxableSub);
	            
	            NumberFormat untaxed = NumberFormat.getCurrencyInstance();
	            String untaxedString = untaxed.format(untaxableSub);
	           
	            NumberFormat taxes = NumberFormat.getCurrencyInstance();
	            String taxString = taxes.format( +item.getTaxableSub());
	            
	            NumberFormat formatter = NumberFormat.getCurrencyInstance();
	            String grandTotalString = formatter.format(grandTotal);
	            
		        System.out.println();
	            System.out.println("INVOICE DETAILS");
	            System.out.println("Taxable Sub-total:   " + taxedString);
	            System.out.println("Untaxable Sub-total: "+  untaxedString);
	            System.out.println("Tax:                 " +taxString);
	            System.out.println("Grand Total:         " +grandTotalString);
		    }
	}

