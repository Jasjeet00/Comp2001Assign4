import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private static ArrayList<Student> allStudents = new ArrayList<>();
    // instance variables
    private String studentName;
    private String studentID;
    private String department;
    private ArrayList<Course> coursesEnrolledIn;
    private HashMap<Course, Integer> grades;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, String id, String department)
    {
        studentName = name;
        studentID = id;
        this.department = department;
        coursesEnrolledIn = new ArrayList<>();
        grades = new HashMap<>();
        allStudents.add(this);
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
    /**
     * Drops the specified course for the student 
     * The course is remvoed from the student's list of courses and student is removed from the course's list of students
     */
    public void dropCourse(Course course)
    {
        coursesEnrolledIn.remove(course);
        course.studentsInCourse.remove(this);
    }
    /**
     * Sets the grade for the specified course
     */
    public void setGrade(Course course, int grade)
    
    {
      grades.put(course,grade);
      
    }
    /**
     * Returns the grade for the specified course
     */
    public int getGrade(Course course)
    
    {
        return grades.get(course);
        
        
    }
   
     public void printStudentsInDepartment(String department)
    {
        for(Student student : allStudents)
        {
            if(student.department == department)
            {
                System.out.println("Student - " + student.studentName + " (ID: " + student.studentID + ")");
                System.out.println("Enrolled in:");
                for(Course course : student.coursesEnrolledIn)
                {
                    System.out.println(course.courseNumber);
                }
            }
        }
    }
}

