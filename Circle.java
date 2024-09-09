public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
    
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);

    }

    public boolean equals(Object isEqual) {
        if (this == isEqual) return true;
        if (getClass() != isEqual.getClass()) return false;
        Circle other = (Circle) isEqual;
        return Double.compare(this.radius, other.radius) == 0;
    }

}
