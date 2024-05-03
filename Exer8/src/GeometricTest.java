public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 2.3);
        Circle c2 = new Circle("blue", 1.0, 3.3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean isEquals = test.equalsArea(c1, c2);
        if(isEquals){
            System.out.println("They are equal.");
        }else {
            System.out.println("They are not equal.");
        }
    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println("The area is " + g.findArea());
    }
}


