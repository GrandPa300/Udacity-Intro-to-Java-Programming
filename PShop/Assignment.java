package PShop;

// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

public class Assignment
{
    private String photoDescription;
    private int priority;
    
    public Assignment(String photoDescription, int priority)
    {
        this.photoDescription = photoDescription;
        this.priority = priority;
    }
    
    public String getDescription()
    {
        return photoDescription;
    }
    
    public int getPriority()
    {
        return priority;
    }
}
