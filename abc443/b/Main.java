import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int i = 0;
        int count = 0;

        while (count < K) {
            count = count + N + i;
            i++;
        }
        System.out.println(i - 1);
    }
}
