package Ativ4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de formas: ");
        int shapeCount = input.nextInt();
        Shape shapes[] = new Shape[shapeCount];


        //Creating Shapes
        for(int i = 0; i < shapeCount; i++){
            input.nextLine();
            System.out.println("** Shape " + (i + 1));
            System.out.println("Retângulo ou Circulo (r/c)?:");
            String shapeType = input.nextLine().toLowerCase();
            System.out.println("Cor (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.nextLine());
            //Creating Rectangle
            if(shapeType.equals("r")){
                System.out.println("Largura: ");
                double width = input.nextDouble();
                System.out.println("Altura: ");
                double height = input.nextDouble();
                Shape shape = new Rectangle(width, height);
                shapes[i] = shape;
            }else if(shapeType.equals("c")){
                System.out.println("Raio: ");
                double radius = input.nextDouble();
                Shape shape = new Circle(radius);
                shapes[i] = shape;
            }else{
                System.out.println("Shape Inválido");
            }
        }

        System.out.println("Área das formas: ");
        for(int i = 0; i < shapeCount; i++){
            System.out.printf("%.2f\n", shapes[i].area());
        }
        input.close();

    }
}
