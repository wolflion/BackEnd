
public class E1006Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public E1006Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		//
	}
}
