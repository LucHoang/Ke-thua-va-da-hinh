package exercise.CircleCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3, "white", 5);
        System.out.println(cylinder);
    }
}
