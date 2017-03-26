package PShop;

// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.
import java.util.ArrayList;
import PShop.SimpleGUI.Picture;
import PShop.SimpleGUI.Text;

public class Portfolio
{
    private ArrayList<FinishedPhoto> finished_works;
    private final double WIDTH = 675;
    
    public Portfolio()
    {
        finished_works = new ArrayList<FinishedPhoto>();
    }
    
    public void addFinishedWork(String file_name, String photographer)
    {
        FinishedPhoto photo_work = new FinishedPhoto(file_name, photographer);
        finished_works.add(photo_work);
    }
    
    public void displayFinishedWorks()
    {
        double photo_pos_x = 0;
        double photo_pos_y = 0;
        double photo_width = 0; 
        double photo_height = 0;
        int count = 0;
        double gap = 16;
        
        for (FinishedPhoto finished_work : finished_works)
        {
            Picture photo_work = new Picture(finished_work.getPhoto());
            Text photographer = new Text(0,0,finished_work.getPhotographer());
            
            photo_width = photo_work.getWidth();
            photo_height = photo_work.getHeight();
            
            photo_work.translate(photo_pos_x, photo_pos_y);
            photographer.translate(photo_pos_x, photo_pos_y + photo_height);
            
            photo_work.draw();
            photographer.draw();
            
            count++;
            photo_pos_x = (photo_pos_x + photo_width) % (WIDTH);
            photo_pos_y = (photo_height + gap) * (count / 3);
        }
    }
}
