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

    // TODO: Write the constructor (two parameters, the step, and a Pixel object)

    @Override
    public Image apply(Image img) {
            // grab the pixels
        Pixel [][] pixels = img.getPixels();

            // TODO: write the iteration code
            // This should replace pixels at the step with the RGB component

            // create an image from the modified pixels and return it
        return new Image(pixels);
    }
}