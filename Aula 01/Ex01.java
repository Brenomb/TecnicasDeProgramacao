/*Entrar via teclado com o valor de uma temperatura em graus Celsius,
calcular e exibir sua temperatura equivalente em Fahrenheit (F = C *1.8 + 32). */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é a temperatura");
        double Celcius = input.nextDouble();
        System.out.println(Celcius * 1.8 + 32);
    }
}