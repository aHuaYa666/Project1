public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return super.findArea() * getLength();
    }
    public double findArea(){
        return 3.14 * getRadius() * getRadius() * 2 + 2 * 3.14 * getRadius() * getRadius();
    }
}
