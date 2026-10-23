import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        int tmp = 0;
        int K = 3;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            array[i] = A;
        }

        if (array[0] < array[1]) {
            tmp = array[0];
            array[0] = array[1];
            array[1] = tmp;
        }

        if (array[1] < array[2]) {
            tmp = array[1];
            array[1] = array[2];
            array[2] = tmp;
        }

        if (array[0] < array[1]) {
            tmp = array[0];
            array[0] = array[1];
            array[1] = tmp;
        }

        int f = array[0];
        int s = array[1];
        int t = array[2];
        System.out.println(t);

        for (int i = 0; i < N - K; i++) {
            if (t < array[i + 3]) {
                t = array[i + 3];
                if (t > s) {
                    tmp = s;
                    s = t;
                    t = tmp;
                    if (s > f) {
                        tmp = f;
                        f = s;
                        s = tmp;
                    }
                }
            }

            System.out.println(t);
        }
    }
}
