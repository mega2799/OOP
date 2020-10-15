package oop.lab03.acme;

public class Exam {
	private int id;
	private int maxStudents;
	private int registeredStudents;
	private String courseName;
	
	String[] classes = new String[]{"OOP", "OS"}; 
	Professor prof = new Professor(1, "matteo", "santoro", "caccapopo", classes ); 
	ExamRoom room = new ExamRoom(310, "2.12", true , true);
	Student[] students = new Student[2];
	
	
}
