package Cap3;
//Crie um programa que demonstre a diferença entre o pré-incremento
//(++variavel) e o pós-incremento (variavel++). Utilize exemplos práticos e exiba os resultados
//no console.
public class Ex29
{
    public static void main( String[] args )
    {
        int valorPrePos = 10;

        System.out.println("Valor inicial: " + valorPrePos);
        int preIncremento = ++valorPrePos;

        System.out.println("Após pré-incremento (++valor): " + preIncremento);
        int posIncremento = valorPrePos++;

        System.out.println("Após pós-incremento (valor++): " + posIncremento);

        System.out.println("Valor final após pós-incremento: " + valorPrePos);
    }
}
