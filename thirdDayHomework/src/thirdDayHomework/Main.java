package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Mahmut", "Terzi", "terzi437@gmail.com", 2);
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "*****@gmail.com", 3000);

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		studentManager.login(student1);
		studentManager.addCourse(student1);
		instructorManager.login(instructor1);
		instructorManager.updateCourse(instructor1);
	}

}
