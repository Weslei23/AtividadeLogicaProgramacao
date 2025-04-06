package Cap3;
//Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível para votar
//(idade igual ou superior a 18 anos).

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Voce pode votar!");
        }else {
            System.out.println("Voce ainda não pode votar!");
        }
    }
}
