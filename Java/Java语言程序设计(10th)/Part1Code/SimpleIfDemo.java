import java.util.*;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if(number % 5 == 0)
			System.out.println("HiFive");
		
		if(number % 2 == 0)
			System.out.println("HiEven");

	}

}
