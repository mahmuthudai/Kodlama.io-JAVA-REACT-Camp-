package thirdDayHomework;

public class StudentManager extends UserManager {
	public void addCourse(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kursu ba�ar�l� bir �ekilde eklediniz.");
	}

	public void deleteCourse(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kursu ba�ar�l� bir �ekilde sildiniz.");
	}
}
