import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira um número");
        int num = myObj.nextInt();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum+= i;
            }
        }
        if(sum == num){
            System.out.println("o numero é perfeito");
        }
    }
}
