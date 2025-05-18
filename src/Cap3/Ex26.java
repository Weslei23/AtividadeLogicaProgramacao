package Cap3;

import java.util.Scanner;

//Crie um programa que declare uma variável inteira, atribua um valor a ela e,
//em seguida, modifique o valor utilizando os operadores de atribuição
//  (+=, -=, *=, /=, %=).
//Exiba o resultado após cada operação.

public class Ex26
{
    public static void main( String[] args )
    {
        int n1 = 10;

        n1 += 10;
        System.out.println( "valor += 10: " + n1 );

        n1 -= 5;
        System.out.println( "valor += 10: " + n1);

        n1 *= 5;
        System.out.println( "valor += 10: " + n1);

        n1 /= 10;
        System.out.println( "valor += 10: " + n1);

        n1 %= 2;
        System.out.println( "valor += 10: " + n1);

    }
}
