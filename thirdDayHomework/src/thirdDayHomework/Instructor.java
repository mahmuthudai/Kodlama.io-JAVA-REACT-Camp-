package thirdDayHomework;

public class Instructor extends User {
	private int numberOfStudent;

	public Instructor(int id, String firstName, String lastName, String email, int numberOfStudent) {
		super(id, firstName, lastName, email);
		this.numberOfStudent = numberOfStudent;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
}
