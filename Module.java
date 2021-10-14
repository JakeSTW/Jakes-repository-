
/**
 * Write a description of class Module here.
 *
 * @author (Jake Stewart)
 * @version (13/10/21)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Module constructor assigns the code and title for a module
     * it also intialises the credit value to 0 
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        this.credit = 0;
    }

    /**
     * This module returns code for the module
     *
     *@return code represent the module code
     */
    public String getCode()
    {
        // put your code here
        return code;
    }
    
    public String getTitle()
    {
        // put your code here
        return title;
    }
    
    public int getCredit()
    {
        // put your code here
        return credit;
    }
    
    public void setCredit(int credit)
   {
       this.credit = credit;
   }
   
   /**
    * print the details of the module which includes
    * the code, title and credits
    */
   
   public void print()
    {
        System.out.println(" Module Code; " + code + ": "+ title);
        System.out.println(" Credit: " + credit);
        System.out.println();
        
    }
}