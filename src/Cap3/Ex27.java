package Cap3;
// Escreva um programa que declare uma variável inteira, aplique o operador de
//incremento (++) e decremento (--), e exiba o valor da variável antes e depois de cada
//operação.
public class Ex27
{
    public static void main( String[] args )
    {
        int valor = 20;
        System.out.println( "Valor sem incremento: " + valor );
        System.out.println( "Valor com incremento: " + ++valor );

        System.out.println( "Valor sem incremento: " + valor );
        System.out.println( "Valor com incremento: " + --valor );
    }
}
