import school.*;

class Example {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 1234);
        // System.out.println(s.firstName);
        // System.out.println(s.lastName);
        // System.out.println(s.id);
        // System.out.println(s.getFullName());
        // System.out.println(s.toString());
        Course c = new Course("Computer Science", "CS101", "Mr. Merrell", "L39B");
        // System.out.println(c.toString());
        s.addCourse(c);
        s.addCourse(c);
        s.addCourse(new Course ("Calculus", "CLCAB", "Mr. Jacotin", "E3"));
        s.listCourses();
    }
}