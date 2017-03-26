package PShop;

// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

public class FinishedPhoto
{
    private String photo;
    private String photographer;
    
    public FinishedPhoto(String file_name, String photographer)
    {
        this.photo = file_name;
        this.photographer = photographer;
    }
    
    public String getPhoto()
    {
        return photo;
    }
    
    public String getPhotographer()
    {
        return photographer;
    }
}
