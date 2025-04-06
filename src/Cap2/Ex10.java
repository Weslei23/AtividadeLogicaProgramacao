package Cap2;
//Desenvolva um programa que exiba o valor de uma variável double com duas casas
//decimais. Utilize formatação para garantir que o valor seja exibido corretamente.

public class Ex10 {
    public static void main(String[] args) {
        double num = 24.444;

        System.out.println(String.format("Número formatado: %.2f ",num));
    }
}
