import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                new Rectangle("Rectangle1", 4, 5),
                new Rectangle("Rectangle2", 3, 6),
                new Rectangle("Rectangle3", 2, 8)
        };

        Circle[] circles = {
                new Circle("Circle1", 3),
                new Circle("Circle2", 5),
                new Circle("Circle3", 2)
        };

        // 2.1) Компаратор для сортування за назвою фігури в порядку зростання
        Comparator<GeometricFigure> nameComparator = Comparator.comparing(GeometricFigure::getName);

        // 2.2) Компаратор для сортування площі фігури у зворотному порядку
        Comparator<GeometricFigure> areaReverseComparator = Comparator.comparingDouble(GeometricFigure::calculateArea).reversed();

        // 2.3) Компаратор, який спочатку порівнює за площею, а потім за назвою
        Comparator<GeometricFigure> areaThenNameComparator = Comparator.comparingDouble(GeometricFigure::calculateArea)
                .thenComparing(GeometricFigure::getName);

        // 2.4) Компаратор, який дозволяє порівнювати null-посилання на об'єкти з іншими об'єктами
        Comparator<GeometricFigure> nullsFirstComparator = Comparator.nullsFirst(nameComparator);

        // Сортування масивів
        Arrays.sort(rectangles, nameComparator);
        Arrays.sort(circles, areaReverseComparator);

        // Відображення результатів
        System.out.println("Sorted Rectangles by name:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        System.out.println("\nSorted Circles by area (reverse order):");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
