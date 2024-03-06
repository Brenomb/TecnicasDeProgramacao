import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04e5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int sum = 0, par = 0, impar = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual é o tamanho da lista?");
        int t = myObj.nextInt();

        int[] arrayNum = new int[t];

        for (int i=0; i < arrayNum.length; i++){
            arrayNum[i] = rd.nextInt(100);

            sum += arrayNum[i];
            if(arrayNum[i]%2 == 0){
                par++;
            }else {
                impar++;
            }
        }
        Arrays.sort(arrayNum);
        double media = sum / arrayNum.length;
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("soma total: " + sum);
        System.out.println("total de números pares: " + par);
        System.out.println("total de números ímpares: " + impar);
        System.out.println("Média geral: " + media);


    }
}
