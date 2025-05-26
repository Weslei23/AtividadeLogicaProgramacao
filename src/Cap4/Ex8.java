package Cap4;
//Desenvolva um programa que leia uma nota escolar (de 0 a 10) e classifique-a
//como "Insuficiente" (menor que 5), "Suficiente" (entre 5 e 7) ou "Bom" (maior que 7).

import java.util.Scanner;

public class Ex8
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int nota = sc.nextInt();

        if ( nota < 5 )
        {
            System.out.println( "Insuficiente" );
        }
        else if ( nota > 5 && nota < 7 )
        {
            System.out.println( "Suficiente" );
        }
        else if ( nota > 7 && nota < 10 )
        {
            System.out.println( "Bom" );
        }
        else
        {
            System.out.println( "Valor invalido" );
        }
    }
}
