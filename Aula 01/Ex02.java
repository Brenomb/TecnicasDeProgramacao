/*Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
 Se a média final for maior ou igual a 6 informar também que o aluno esta aprovado,
 se for menor que três que esta reprovado e se for maior ou igual a três e
 menor que seis que esta de exame.*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double soma = 0, nota = 0;
        for(int i = 1; i <= 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Insira %sº a nota ", i);
            nota = input.nextDouble();
            soma += nota;
        }
        if(nota < 3){
            System.out.println("Aluno reprovado com média: " + soma/4);
        } else if (nota < 6) {
            System.out.println("Aluno de exame com média: " + soma/4);
        }else {
            System.out.println("Aluno Aprovado com média: " + soma/4);
        }
    }
}