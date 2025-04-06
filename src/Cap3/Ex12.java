package Cap3;

import java.util.Scanner;

//Escreva um programa que leia três números inteiros do usuário e calcule a média aritmética
//deles. Exiba o resultado no console.
public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 =  sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("A média é igual a: " + media);

        sc.close();
    }
}
