/**
 * This Filter replaces pixels with another color at a regular interval.
 */

import org.bvsd.*;

public class RegularPixelReplaceFilter implements Filter {
        /** The step at which to replace pixels */
    private int step;
        /**  The red component of the replacement color */
    private int red;
        /**  The green component of the replacement color */
    private int green;
        /**  The blue component of the replacement color */
    private int blue;

    // Write the constructor (two parameters, the step, and a Pixel object)

    public RegularPixelReplaceFilter(int st, Pixel px) {
        step = st;
        red = px.getRed();
        green = px.getGreen();
        blue = px.getBlue();
    }

    @Override
    public Image apply(Image img) {
            // grab the pixels
        Pixel [][] pixels = img.getPixels();

            // write the iteration code
            // This should replace pixels at the step with the RGB component
        int count = 1;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                if (count % step == 0) {
                    pixels[row][col].setRed(red);
                    pixels[row][col].setGreen(green);
                    pixels[row][col].setBlue(blue);
                }

                count++;
            }
        }
            // create an image from the modified pixels and return it
        return new Image(pixels);
    }
}