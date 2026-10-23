import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            list.add(X);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            boolean ok = true;

            for (int j = 0; j < N; j++) {

                if (i == j) {
                    continue;
                }

                if (Math.abs(list.get(i) - list.get(j)) < D) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                ans.add(i + 1);
            }
        }

        System.out.println(ans.size());

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
