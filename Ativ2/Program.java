package Ativ2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rect.width = input.nextDouble();
        rect.height = input.nextDouble();
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        input.close();
    }
}