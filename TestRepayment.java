
import java.util.Scanner; 
import java.text.DecimalFormat;

public class TestRepayment{
	
 
	public static void main(String [] args)
{
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("######.00"); 
	
	System.out.print ("Enter the loan amount: ");
	double loan = input.nextDouble(); 
	
	System.out.print("Enter the interest rate: ");
	double rateAmount = input.nextDouble (); 
	
	System.out.print("Please the loan period in years: ");
	int period = input.nextInt(); 
	
//create an object of the MonthlyRepaymnet class 
 
	MonthlyRepayment repay = new MonthlyRepayment(loan,rateAmount,period); 
	double monCost = repay.calcMonthlyRepayment(); //1
	
	System.out.println("Monthly repayment for loan amount: R " +loan + "\nInterest Rate: " 
	+ rateAmount+ "\nPeriod(in years): " +period + "\nMonthly Repayment: R"+ monCost); 
	}
}