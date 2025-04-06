package Cap2;

import java.util.Scanner;

//Desenvolva um programa que declare duas variáveis int e realize as operações de soma,
//subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados de cada
//operação.
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = sc.nextInt();

        System.out.println("Digite um valor: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int mult = num1 * num2;
        int mod = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Mod: " + mod);
    }
}
