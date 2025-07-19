package Cap4;
//Escreva um programa que calcule a soma de todos os números de 1 a 100.

public class Ex19
{
    public static void main( String[] args )
    {
        int soma = 0;

        for( int i = 1; i <= 100; i++ )
        {
            soma += i;
            System.out.println( "Soma: " + soma );
        }
    }
}
