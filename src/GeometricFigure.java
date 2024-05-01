import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public abstract class GeometricFigure {
    private String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateArea();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeometricFigure that = (GeometricFigure) obj;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Rectangle extends GeometricFigure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName() + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}

class Circle extends GeometricFigure {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", radius=" + radius +
                '}';
    }
}
