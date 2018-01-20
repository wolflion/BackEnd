
public class E902SimpleCircle {
	
	public static void main(String[] args) {
		E902SimpleCircle circle1 = new E902SimpleCircle();
		System.out.println("The area of the circle of radius " 
				+ circle1.radius + "is" + circle1.getArea());
			
			SimpleCircle circle2 = new SimpleCircle(25);
			System.out.println("The area of the circle of radius " 
				+ circle2.radius + "is" + circle2.getArea());
			
			SimpleCircle circle3 = new SimpleCircle(125);
			System.out.println("The area of the circle of radius " 
				+ circle3.radius + "is" + circle3.getArea());
			
			circle2.radius = 100;
			System.out.println("The area of the circle of radius " 
					+ circle2.radius + "is" + circle2.getArea());
		}
	double radius;
	
	E902SimpleCircle()
	{
		radius = 1;
	}
	
	E902SimpleCircle(double newRadius)
	{
		radius = newRadius;
	}
	
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
}

