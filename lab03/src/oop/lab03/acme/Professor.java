package oop.lab03.acme;

public class Professor implements User {
	private int id;
	private String name;
	private String surname;
	private String password;
	private String[] courses;


	
	public Professor(int id, String name, String surname, String password, String[] courses) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.courses = courses;
	}

	@Override
	public String getUsername() {
		return this.name;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
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
