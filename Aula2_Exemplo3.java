/* Exemplo 3
 */
package aula2_java;

import java.util.Scanner;

public class Aula2_Exemplo3 {

    public static void main(String args[]) {
        double num1, num2, media;
        String nome;
        Scanner sc1 = new Scanner(System.in, "latin1");

        System.out.print("Digite seu Nome: ");
        nome = sc1.nextLine();

        System.out.print("Digite um Número: ");
        num1 = sc1.nextDouble();

        System.out.print("Digite outro Número: ");
        num2 = sc1.nextDouble();

        media = (num1 + num2) / 2;

        if (media >= 7) {
            System.out.print(nome + " você foi Aprovado");
        } else if (media <= 5) {
            System.out.println(nome + " você foi Reprovado");
        } else {
            System.out.println(nome + " você está de Recuperação");
        }

        System.out.println(" Sua média final é: " + media);

    }//Fim    
}//Não apagar
