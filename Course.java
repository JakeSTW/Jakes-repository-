
/**
 * Write a description of class Course here.
 *
 * @author (Jake Stewart)
 * @version (13/10/21)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String code;
    
    private String title;
    
    private Module module;

    /**
     * Create a course with maximum number of enrolments.
     * All other details are set to unknown values.
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
       
    }

    /**
     * This prints out the details of the course, the list of students
     * enrolled and the module.
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Course Code; " + code + ": "+ title);
        module.print();
        System.out.println();
        
    }
    
    /**
     * Prints out the details of the course to the terminal
     */
    private void printHeading()
    {
       System.out.println("----------------------------------");
       System.out.println("    App211: Course Details");
       System.out.println("----------------------------------");
       System.out.println();
    }
    
    public void assignModule(Module module)
{
    this.module = module;
}
}

