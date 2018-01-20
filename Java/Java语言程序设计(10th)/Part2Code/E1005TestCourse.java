
public class E1005TestCourse {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		E1006Course course1 = new E1006Course("Data Structures");
		E1006Course course2 = new E1006Course("Database Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: "
				+ course1.getNumberOfStudents());
		
		String[] students = course1.getStudents();
		for(int i=0;i<course1.getNumberOfStudents();i++)
			System.out.print(students[i]+", ");
		
		System.out.println(); // 手动换行
		System.out.print("Number of students in course2: " 
				+ course2.getNumberOfStudents());

	}

}
