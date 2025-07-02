package learning;

public class LikesDisplay {
    
    static int likes = 0;  
    
    public static void LikesCount() {
        likes++;
    }
   
    public static void display() {
        System.out.println("Total Likes: " + likes);
    }

    public static void main(String[] args) {
        
        LikesDisplay.LikesCount();  
        LikesDisplay.LikesCount(); 
        
        LikesDisplay.display();     
    }
}
