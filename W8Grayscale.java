import java.awt.Color;
public class W8Grayscale {
    public static void main(String[] args) 
 { 
 Picture pic = new Picture(args[0]); 
 for (int col = 0; col < pic.width(); col++) 
 for (int row = 0; row < pic.height(); row++) 
 { 
 Color color = pic.get(col, row); 
 Color gray = W8Luminance.toGray(color); 
 pic.set(col, row, gray);
 } 
 pic.show(); 
 } 
}
