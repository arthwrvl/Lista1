package Ativ1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Preço do dolar: ");
        double dollarPrice = input.nextDouble();
        System.out.println("Quantos dolares serão comprados? ");
        double amount = input.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Valor a ser pago em Reais = %.2f%n", result);
        input.close();


    }
}