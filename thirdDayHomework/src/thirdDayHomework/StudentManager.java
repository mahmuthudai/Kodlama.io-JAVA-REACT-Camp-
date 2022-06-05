package thirdDayHomework;

public class StudentManager extends UserManager {
	public void addCourse(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kursu başarılı bir şekilde eklediniz.");
	}

	public void deleteCourse(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kursu başarılı bir şekilde sildiniz.");
	}
}
