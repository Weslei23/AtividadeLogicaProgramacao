package Cap3;
//Escreva um programa que leia a idade de três pessoas e verifique se pelo menos duas
//delas são maiores de idade (18 anos ou mais).

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();
        System.out.print("Digite a idade da terceira pessoa: ");
        int idade3 = sc.nextInt();

        int maioridade = 0;

        if (idade1 >= 18) maioridade++;
        if (idade2 >= 18) maioridade++;
        if (idade3 >= 18) maioridade++;
        if (maioridade >= 2) {
            System.out.println("Pelo menos duas pessoas são maiores de idade. ");
        } else {
            System.out.println("Nenhum deles é maior de idade.");
        }
    }
}
