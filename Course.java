
/**
 * Write a description of class Course here.
 *
 * @author (Jake Stewart)
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Course Code; " + code + ": "+ title);
        System.out.println();
        
    }
    
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

