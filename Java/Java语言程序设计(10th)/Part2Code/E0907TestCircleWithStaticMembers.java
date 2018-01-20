
public class E907TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + 
		E906CircleWithStaticMembers.numberOfObjects);
		
		E906CircleWithStaticMembers c1 = new E906CircleWithStaticMembers();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius +
				") and number of Circle objects (" + 
				c1.numberOfObjects + ")");
		
		E906CircleWithStaticMembers c2 = new E906CircleWithStaticMembers(5);
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius +
				") and number of Circle objects (" + 
				c1.numberOfObjects + ")");
		
		System.out.println("c2: radius ("+c2.radius +
				") and number of Circle objects (" + 
				c2.numberOfObjects + ")");

	}

}
