package Cap4;
//Crie um programa que exiba a tabuada de um número fornecido pelo usuário,
//de 1 a 10.

import java.util.Scanner;

public class Ex20
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Qual numero deseja ver a tabuada?" );
        int n = sc.nextInt();

        for( int i = 0; i <= 10; i++ )
        {
            System.out.println( n * i );
        }
    }
}
