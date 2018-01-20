import java.util.Scanner;

public class E1001TestLoanClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate. for example. 8.25: ");
		double annualInterestRate = input.nextDouble();

		// Enter number of years
		System.out.println("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.println("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		E1002Loan loan = 
				new E1002Loan(annualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\n" + 
		"The monthly payment is %.2f\nThe total payment is %.2f\n",
		loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
		
		input.close();
	}

}
