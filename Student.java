import java.util.ArrayList;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables
    private String studentName;
    private String studentID;
    private String department;
    private ArrayList<Course> coursesEnrolledIn;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, String id, String department)
    {
        studentName = name;
        studentID = id;
        this.department = department;
        coursesEnrolledIn = new ArrayList<>();
    }

    /**
     * Enrolls the student in the specified course
     * The course is added to the student's list of courses and the student is added to the course's list of students
     */
    public void enrollInCourse(Course course)
    {
        coursesEnrolledIn.add(course);
        course.studentsInCourse.add(this);
    }
}
