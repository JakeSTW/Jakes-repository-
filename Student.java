
/**
 * Write a description of class Student here.
 *
 * @author (Jake Stewart)
 * @version (13/10/21)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int id;
    // the students full name
    private String name;
    // The course the student is enrolled on
    private Course course;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int id)
    {
        this.name = name; 
        this.id = id;
    }

    /**
     * An example of a method - replace this comment with your own
     *Return the full name of this student 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Return the student ID of this student.
     */
    public int getID()
        {
        return id;
       }
    
    public void enrol(Course course)
    {
        this.course = course;
    }
    
    /**
     * Print the students name and ID number to the output terminal
     */
    public void print()
    {
        System.out.println("Student ID: + id + Name: " + name);
        
}


}
