
public class E906CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects = 0;
	
	E906CircleWithStaticMembers() {
		// TODO 自动生成的构造函数存根
		radius = 1;
		numberOfObjects++;
	}
	
	E906CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}

}
