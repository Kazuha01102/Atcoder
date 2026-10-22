import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] card = new int[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            card[i] = A;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (card[i] == card[j]) {
                    card[i] = 0;
                    card[j] = 0;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            ans = ans + card[i];
        }
        System.out.println(ans);
    }
}
