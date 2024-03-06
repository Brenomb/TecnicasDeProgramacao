/*O programa deverá nos solicitar a digitação dos valores de mês e ano em formato numérico,
 se o valor do mês estiver fora do intervalo de 1 a 12 sinalizar o erro,
 caso contrário informar quantos dias tem o mês em questão.
 */


import java.io.PrintStream;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int ano = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o mês ");
        int mes = input.nextInt();
        if(mes >= 1 && mes <= 12){
            System.out.println("Insira o ano ");
            ano = input.nextInt();
        }else{
            System.out.println("o valor do mês precisa estar entre 1 e 12");
        }

        int dias = 31;
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                //Verifica se o ano é bissexto
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        }
        System.out.printf("O mês %d de %d tem %d dias.", mes, ano, dias);

    }
}
