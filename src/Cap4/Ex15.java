package Cap4;

import java.util.Scanner;

/*
Crie um programa que leia a idade de uma pessoa e classifique-a em uma das
seguintes categorias:
● 0 a 12: Criança
● 13 a 17: Adolescente
● 18 a 59: Adulto
● 60 ou mais: Idoso
 */
public class Ex15
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite a sua idade: " );
        int idade = sc.nextInt();

        if( idade <= 12 )
        {
            System.out.println( "Criança" );
        }
        else if( idade >= 13 && idade <= 17 )
        {
            System.out.println( "Adolescente" );
        }
        else if ( idade >= 18 && idade <= 59 )
        {
            System.out.println( "Adulto" );
        }
        else
        {
            System.out.println( "Idoso" );
        }
    }
}
