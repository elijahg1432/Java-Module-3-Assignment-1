public class TestGeometricObject {
    /** Main method */
    public static void main(String[] args) {
        // Create two circle objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Circle(5);

        System.out.println("The two circles have the same area? " +
            equalArea(geoObject1, geoObject2));

        System.out.println("What about their radii? " + geoObject1.equals(geoObject2));

        // Display the first circle
        displayGeometricObject(geoObject1);

        // Display the second circle
        displayGeometricObject(geoObject2);
    }

    /** A method for comparing the areas of two geometric objects */
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /** A method for displaying a geometric object */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
