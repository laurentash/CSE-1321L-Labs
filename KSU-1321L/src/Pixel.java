public class Pixel {
    private int red;
    private int green;
    private int blue;


    public Pixel() {

        this.red = 255;
        this.green = 255;
        this.blue = 255;
    }


    public Pixel(int red, int green, int blue) {

        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    public void changeRGB(int red, int green, int blue) {

        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    public void printRGB() {

        System.out.println(red + " " + green + " " + blue);
    }
}
