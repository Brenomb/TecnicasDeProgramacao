/*Calcular e exibir a média geométrica de quatro valores quaisquer
que serão digitados (M = raiz quarta de (v1*v2*v3*v4)).*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int total = 1, valores = 0;
        for (int i = 1; i <= 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Insira o %sº valor ", i);
            valores = input.nextInt();
            total *= valores;
        }
        double mediaGeometrica = Math.pow(total, 1.0 / 4.0);
        System.out.println("A média geometrica é: " + Math.round(mediaGeometrica));
    }
}
