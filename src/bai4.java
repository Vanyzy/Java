import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hình tròn
        System.out.print("Nhap ban kinh hinh tron: ");
        double radius = scanner.nextDouble();
        double diameter = 2 * radius;
        double circleCircumference = diameter * 3.14;
        double circleArea = (diameter * diameter / 4) * 3.14;
        System.out.println("Chu vi hinh tron: " + circleCircumference);
        System.out.println("Dien tich hinh tron: " + circleArea);

        // Hình vuông
        System.out.print("Nhap canh cua hinh vuong: ");
        double side = scanner.nextDouble();
        double squarePerimeter = side * 4;
        double squareArea = side * side;
        System.out.println("Chu vi hinh vuong: " + squarePerimeter);
        System.out.println("Dien tich hinh vuong: " + squareArea);

        // Hình chữ nhật
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        double length = scanner.nextDouble();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        double width = scanner.nextDouble();
        double rectanglePerimeter = (length + width) * 2;
        double rectangleArea = length * width;
        System.out.println("Chu vi hinh chu nhat: " + rectanglePerimeter);
        System.out.println("Dien tich hinh chu nhat: " + rectangleArea);

        scanner.close();
    }
}

