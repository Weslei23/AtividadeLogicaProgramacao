package Cap4;
// Escreva um programa que leia as idades de duas pessoas e exiba quem é
//mais velho. Caso as idades sejam iguais, exiba uma mensagem informando que as duas
//pessoas têm a mesma idade.

import java.util.Scanner;

public class Ex9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Digite uma idade: " );
        int idade = sc.nextInt();

        System.out.println( "Digite outra idade: " );
        int idade2 = sc.nextInt();

        if ( idade > idade2 )
        {
            System.out.println( "A primeira idade é maior que a segunda" );
        }
        else if ( idade == idade2 )
        {
            System.out.println( "As idades são iguais" );
        }
        else
        {
            System.out.println( "A segunda idade é maior que a primeira" );
        }

    }
}
