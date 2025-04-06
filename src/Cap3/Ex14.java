package Cap3;
//Crie um programa que converta uma temperatura em graus Celsius para Fahrenheit. A
//fórmula de conversão é: F = (C * 9/5) + 32. Exiba o resultado no console.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) +32;

        System.out.println("A conversão é igual a: " + fahrenheit + " graus Fahrenheit!");
    }
}
