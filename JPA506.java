public class JPA506 {
    public static void main(String[] args) {

        double radius = 5;
        double pi = 3.1415926;

        double circleArea = calCircle(radius, pi);
        System.out.printf("圓形面積為 : %f\n" ,circleArea);

        double base = 10;
        double height = 5;

        double triangleArea = calTriangle(base, height);
        System.out.printf("三角形面積為 : %f\n" ,triangleArea);

        double length = 5;
        double width = 10;

        double rectangleArea = calRectangle(length, width);
        System.out.printf("長方形面積為 : %.0f\n" ,rectangleArea);

        double totalArea = circleArea + triangleArea + rectangleArea;
        System.out.printf("此圖形面積為 : %f" ,totalArea);
    }

    public static double calCircle(double radius, double pi) {
        return radius * radius * pi;
    }

    public static double calTriangle(double base, double height) {
        return base * height / 2;
    }

    public static double calRectangle(double length, double width) {
        return length * width;
    }
}
