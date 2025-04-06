package Cap2;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro e um número decimal do teclado e, em
//seguida, exiba a soma desses números no console.
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int inteiro = sc.nextInt();

        System.out.println("Digite um número decimal: ");
        double decimal = sc.nextDouble();

        int conversao = (int) decimal;
        int soma = conversao + inteiro;
        System.out.println(soma);

        sc.close();
    }
}
