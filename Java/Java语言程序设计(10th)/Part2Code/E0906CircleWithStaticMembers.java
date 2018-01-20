
public class E906CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects = 0;
	
	E906CircleWithStaticMembers() {
		// TODO �Զ����ɵĹ��캯�����
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
