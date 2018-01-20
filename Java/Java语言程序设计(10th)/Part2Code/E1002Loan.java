
public class E1002Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public E1002Loan()
	{
		// 直接写构造函数这种，编译器报错
		this(2.5,1,1000); // 这个this不是很懂，应该是chap9给解释过
	}
	
	public E1002Loan(double annualInterestRate, int numberOfYears,
			double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		// TODO 自动生成的方法存根
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears()
	{
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears)
	{
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment()
	{
		double monthlyInterestRate = annualInterestRate/1200;
		double monthlyPayment = loanAmount*monthlyInterestRate/(1-
				(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double monthlyInterestRate = annualInterestRate/1200;
		double monthlyPayment = loanAmount *monthlyInterestRate/(1-
				(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
		return monthlyPayment;
	}
	
	public java.util.Date getLoanDate()
	{
		return loanDate;
	}
}
