import java.util.*;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
        int side = scanner.nextInt();
        int bySide = calculateBySide(side);
        int diagonal = calculateByDiagonal(side);
        int perimeter = calculateByPerimeter(side);
        System.out.println("Площадь квадрата через сторону: " + bySide + " см. кв.");
        System.out.println("Площадь квадрата через диагональ: " + diagonal + " см. кв.");
        System.out.println("Площадь квадрата через периметр: " + perimeter + " см. кв.");
    }

    public static int calculateBySide(int side) {
        return side * side;
    }

    public static int calculateByDiagonal(int side) {
        int diagonal = side * side;
        return diagonal / 2;
    }

    public static int calculateByPerimeter(int side) {
        int perimeter = side * side;
        return perimeter / 16;
    }
}
