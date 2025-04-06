package Cap3;
//Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da
//potenciação do primeiro número elevado ao segundo número (use o método Math.pow).

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        double calculo = Math.pow(numero1, numero2);

        System.out.println("Resultado da potenciação: " + calculo);
    }
}
