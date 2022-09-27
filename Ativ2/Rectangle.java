package Ativ2;

public class Rectangle {
    public double width;
    public double height;

    double area(){
        return width * height;
    }
    double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    double perimeter(){
        return 2 * (width + height);
    }

}
