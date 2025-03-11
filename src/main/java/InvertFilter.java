public class InvertFilter implements Filter {

    public Image apple(Image img) {
        Pixel [][] pixels = img.getPixels();

        return new Image(pixels);
    }
    
}
