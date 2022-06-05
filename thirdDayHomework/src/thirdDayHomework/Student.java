package thirdDayHomework;

public class Student extends User {
	private int numberOfActiveCourses;

	public Student(int id, String firstName, String lastName, String email, int numberOfActiveCourses) {
		super(id, firstName, lastName, email);
		this.numberOfActiveCourses = numberOfActiveCourses;
	}

	public int getNumberOfActiveCourses() {
		return numberOfActiveCourses;
	}

	public void setNumberOfActiveCourses(int numberOfActiveCourses) {
		this.numberOfActiveCourses = numberOfActiveCourses;
	}

}
