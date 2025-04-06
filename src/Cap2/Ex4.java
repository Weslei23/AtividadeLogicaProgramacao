package Cap2;
//Escreva um programa que converta um valor double em int e outro valor int em double.
//Exiba os resultados das conversões e explique a diferença entre conversão explícita e
//implícita.
public class Ex4 {
    public static void main(String[] args) {
        int num = 40;
        System.out.println("Cast: " + (double)num); // Conversão explicita de int para double

        double num2 = 30.5;

        System.out.println("Cast: " + (int)num2);

        int numero = 10;
        double numeroConvertido = numero; // Conversão implícita de int para double
        System.out.println(numeroConvertido);
    }
}
