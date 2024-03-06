public class Ex01 {
    public static void main(String[] args) {
        int sum = 1, total = 1;
        for (int i = 1; total <= 15; i++) {
            if (i % 2 != 0) {
                sum += i;
                total++;
                System.out.println(sum);
            }
        }
    }
}