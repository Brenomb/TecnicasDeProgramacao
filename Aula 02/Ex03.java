import java.util.Scanner;

public class Ex03 {
    public static int Fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else {
            return Fibonacci(n-1 + n-2);
        }
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira um número");
        int num = myObj.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(Fibonacci(i));
        }
    }
}
