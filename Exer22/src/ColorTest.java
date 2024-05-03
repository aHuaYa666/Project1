public class ColorTest {
    public static void main(String[] args) {
        System.out.println(Color.GREEN);
    }

}

enum Color{
    RED(255, 0, 0, "red"),
    ORANGE(255, 128, 0, "orange"),
    GREEN(255, 255, 0, "yellow"),
    CYAN(0, 255, 255, "cyan"),
    BLUE(0, 0, 255, "blue"),
    PURPLE(128, 0, 255, "purple");
    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " (" + red + "," + green + "," + blue + ")->" + description;
    }
}
