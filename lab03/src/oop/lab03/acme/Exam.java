package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
	private final int id;
	private final int maxStudents;
	private int registeredStudents;
	private final String courseName;
	private final Professor professor;
	private final ExamRoom room ;
	private Student[] students;
	/*
	String[] classes = new String[]{"OOP", "OS"}; 
	Professor prof = new Professor(1, "matteo", "santoro", "caccapopo", classes ); 
	ExamRoom room = new ExamRoom(310, "2.12", true , true);
	Student[] students = new Student[2];
	*/
	public Exam(int id, int maxStudents, String courseName, Professor professor, ExamRoom room ) {
		this.id = id;
		this.maxStudents = maxStudents;
		this.registeredStudents = 0;
		this.courseName = courseName;
		this.professor = professor;
		this.room = room;
		this.students = new Student[] {null};
		}
	
	
	public int getId() {
		return this.id;
	}
	
	public int getMaxStudents() {
		return this.maxStudents;
	}
	
	public int getRegisteredStudents() {
		return this.registeredStudents;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public ExamRoom getRoom() {
		return this.room;
	}
	
	public Student[] getStudents() {
		return this.students;
	}
	
	
	
	public static Student[] addStudent(int n, Student[] myArray, Student student) 
    {
        if (myArray[0] != null) {
    		Student[] newArray = new Student[n + 1]; 
            //copy original array into new array
    		newArray = Arrays.copyOf(myArray, myArray.length + 1);
            //add element to the new array
            newArray[n] = student; 
            return newArray; 
        } else {
        	return new Student[] {student};
        }
    } 
	
	public void registerStudent(Student student) {
		if ( registeredStudents != maxStudents) {
			registeredStudents += 1;
			students = addStudent(students.length, students, student);
		}
	}
	
	public String toString() {
		return "Exam [id=" + id + ", maxStudents=" + maxStudents + ", registeredStudents=" + registeredStudents
				+ ", courseName=" + courseName + ", professor=" + professor + ", room=" + room + ", students="
				+ Arrays.toString(students) + "]";
	}
	
	
}
