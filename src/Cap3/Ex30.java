package Cap3;

import java.util.Scanner;

// Escreva um programa que leia dois números inteiros do usuário e aplique
//operadores compostos (e.g., +=, -=, *=, /=, %=)para modificar o valor da primeira variável
//em relação à segunda. Exiba o resultado após cada operação.
//Dica: Use o Scanner para receber os números.
public class Ex30
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scanner.nextInt();

        valor1 += valor2;
        System.out.println("Após valor1 += valor2: " + valor1);
        valor1 -= valor2;
        System.out.println("Após valor1 -= valor2: " + valor1);
        valor1 *= valor2;
        System.out.println("Após valor1 *= valor2: " + valor1);
        valor1 /= valor2;
        System.out.println("Após valor1 /= valor2: " + valor1);
        valor1 %= valor2;
        System.out.println("Após valor1 %= valor2: " + valor1);
    }
}
