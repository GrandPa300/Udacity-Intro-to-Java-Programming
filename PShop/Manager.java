package PShop;

import java.util.ArrayList;

public class Manager
{
    private ArrayList<Assignment> assignments;
    private ArrayList<Photographer> photographers;
    private Portfolio photo_works;

    public Manager()
    {
        assignments = new ArrayList<Assignment>();
        photographers = new ArrayList<Photographer>();
        photo_works = new Portfolio();
    }

    /**
     * Called when it's time to hire a new photographer.
     */
    public void hire(String photographer)
    {
        photographers.add(new Photographer(photo_works, photographer));
    }

    /**
     * Called when it's time for the daily meeting where
     * the highest priority assignments are given to photographers.
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority
     * assignment should go to the photographer who was hired first.
     */
    public void giveOutAssignments()
    {
        for (Photographer photographer : photographers)
        {
            if (assignments.size() > 0)
            {
                Assignment top_assignment = getHighestPriority();
                photographer.getAssignment(top_assignment);
                assignments.remove(top_assignment);
            }
            else
            {
                return;
            }
        }
    }
    
    private Assignment getHighestPriority()
    {
        Assignment top_assignment = new Assignment("dummy",0);
        
        for (Assignment assignment : assignments)
        {
            if (assignment.getPriority() > top_assignment.getPriority())
            {
                top_assignment = assignment;
            } 
        }
        return top_assignment;
    }
       
    /**
     * A Customer came up with a new assignment. The manager should
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     */
    public void newAssignment(String description, int priority)
    {
        assignments.add(new Assignment(description, priority));
    }

    /**
     * It's the end of the story for now. Time to look at all the
     * work the company has done.
     */
    public void checkPortfolio()
    {
        photo_works.displayFinishedWorks();
    }
}
