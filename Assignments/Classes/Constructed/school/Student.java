package school;

import java.util.*;

public class Student {
    public String firstName;
    public String lastName;
    public int id;
    public ArrayList<Course> courses; 

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.courses = new ArrayList<Course>();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "; ID: " + id;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void listCourses() {
        System.out.println("Courses: ");
        for(int i = 0; i < courses.size(); i++) {
            System.out.println("\t" + courses.get(i));
        }
    }
}