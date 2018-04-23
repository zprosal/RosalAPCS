package school;

import java.util.*;

public class Course {
    public String courseName;
    public String courseID;
    public String teacherName;
    public String room;

    public Course (String courseName, String courseID, String teacherName, String room) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.teacherName = teacherName;
        this.room = room;
    }

    public String toString() {
        return "Course: " + courseName + "; ID: " + courseID
        + "; Teacher: " + teacherName + "; Room: " +  room;
    }
}