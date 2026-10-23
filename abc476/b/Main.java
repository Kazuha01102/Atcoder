import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        char[] a = new char[N];
        char[] b = new char[N];

        for (int i = 0; i < N; i++) {
            a[i] = S.charAt(i);
            b[i] = T.charAt(i);
            if (a[i] == b[i]) {
                continue;
            } else if (b[i] == '*') {
                b[i] = a[i];
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
