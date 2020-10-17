package oop.lab03.acme;

public class Professor implements User {
	private final int id;
	private final String name;
	private final String surname;
	private final String password;
	private String[] courses;


	
	public Professor(int id, String name, String surname, String password, String[] courses) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.courses = courses;
	}
	
	
	
	public int getId() {
		return this.id;
	}

	public String getSurname() {
		return this.surname;
	}

	public String[] getCourses() {
		return this.courses;
	}

	public String getUsername() {
		return this.name;
	}

	public String getPassword() {
		return this.password;
	}

	public String getDescription() {
		return this.toString();
	}
	
	public void replaceCourses(String course, int index){
		this.courses[index] = course;
	}

	public void replaceAllCourses(String[] courses){
		this.courses = courses;
	}
}
