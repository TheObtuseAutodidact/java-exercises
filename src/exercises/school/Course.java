package exercises.school;

import java.util.ArrayList;
import exercises.school.Student;

public class Course {
    private static String courseId;
    private String courseName;
    private String courseInstructor;
    private ArrayList<Student> students;


    public Course(String aCourseId, String aCourseName) {
        this.courseId = aCourseId;
        this.courseName = aCourseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String aCourseInstructor) {
        this.courseInstructor = aCourseInstructor;
    }

    public ArrayList getStudents() {
        return students;
    }

    public void addStudent(Student aStudent) {
        this.students.add(aStudent);
    }
}


