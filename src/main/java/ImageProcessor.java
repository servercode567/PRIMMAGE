/**
 * This class is the driver class for the image processing code.
 * @author
 * @version 1.0
 * @since 2025-03
 */

import java.io.IOException;
import org.bvsd.*;

public class ImageProcessor {
    public static void main(String [] args) {
        try {
                // TODO: Change this to your uploaded image
            Image img = new Image("resources/yourfile.png");
            
            Filter f = new RegularPixelReplaceFilter(1, new Pixel(255, 0, 255));
            Image modifiedImg = f.apply(img);
            modifiedImg.saveToFile("resources/pixel_replace.png", Image.FORMAT.PNG);
            System.out.println("Successfully applied regular pixel replace filter.");

                // TODO: Write code for your invert image filter
        }
        catch(IOException e) {
            System.err.println("Could not open file because " + e.getMessage());
        }
    }
}