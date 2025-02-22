package oop5_2;

public class Test {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:");
        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.0, 5.0);
        System.out.println("\nCylinder 2:");
        System.out.println(c2);
        System.out.println("Volume: " + c2.getVolume());

        Cylinder c3 = new Cylinder(3.0, "blue", 10.0);
        System.out.println("\nCylinder 3:");
        System.out.println(c3);
        System.out.println("Volume: " + c3.getVolume());

        c1.setHeight(8.0);
        System.out.println("\nCylinder 1 sau khi thay đổi chiều cao:");
        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());
    }
}
