import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (i < N / 2)
                continue;
            count = count + A;
        }
        System.out.println(count);
    }
}
