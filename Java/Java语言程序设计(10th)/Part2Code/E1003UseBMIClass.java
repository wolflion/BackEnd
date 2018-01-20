
public class E1003UseBMIClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		E1004BMI bmi1 = new E1004BMI("Kim Yang", 18,145,70);
		System.out.println("The BMI for " + bmi1.getName() + " is "
				+ bmi1.getBMI() + " " + bmi1.getStatus());
		
		E1004BMI bmi2 = new E1004BMI("Susan King", 215,70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
				+ bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
