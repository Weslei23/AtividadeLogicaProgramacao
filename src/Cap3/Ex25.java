package Cap3;

import java.util.Scanner;

//Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles
//são positivos.
public class Ex25
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite um número: " );
        int num = sc.nextInt();

        System.out.println( "Digite um número: " );
        int num2 = sc.nextInt();

        System.out.println( "Digite um número: " );
        int num3 = sc.nextInt();
        
        if ( num >= 0 )
        {
            System.out.println( "Pelo menos dois numeros sao positivos." );
        }
    }
}
