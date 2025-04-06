package Cap3;
//Desenvolva um programa que leia duas strings do usuário e verifique se elas são iguais.
//Exiba uma mensagem informando o resultado da comparação.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite alguma palavra: ");
        String palavra1 = sc.next();

        System.out.println("Digite alguma palavra: ");
        String palavra2 = sc.next();

        if(palavra1.equals(palavra2)) {
            System.out.println("As duas palavras digitadas são iguais!");
        }else{
            System.out.println("As duas palavras digitadas são diferentes!");
        }

    }
}
