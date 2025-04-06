package Cap3;

import java.util.Scanner;

//Desenvolva um programa que leia a largura e a altura de um retângulo e calcule a área.
//Exiba o resultado no console.
//Dica: area = largura x altura.
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);
    }
}
