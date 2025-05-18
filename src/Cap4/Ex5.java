package Cap4;

import java.util.Scanner;

//Crie um programa que leia uma nota de 0 a 100 e exiba uma mensagem de
//aprovação se a nota for maior ou igual a 60. Caso contrário, exiba uma mensagem de
//reprovação.
public class Ex5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if( nota > 100)
        {
            System.out.println("Valor invalido! Digite uma nota de 0 a 100: ");
        }
        else
        {
            if( nota >= 60)
            {
                System.out.println("Aprovado!");
            }
            else
            {
                System.out.println("Reprovado!");
            }
        }
    }
}
