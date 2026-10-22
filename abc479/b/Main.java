import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        char[] o = new char[N];
        int count = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            o[i] = c;
        }

        for (int i = 0; i < N; i++) {
            if (i == N - 2 && o[i] == 'R' && o[i + 1] == 'R') {
                count = count + 2;
                if (max < count) {
                    max = count;
                }
                break;
            }
            if (i == N - 1 && o[i] == 'R') {
                count++;
                if (max < count) {
                    max = count;
                }
                break;
            }
            if (o[i] == 'R' && o[i + 1] == 'R') {
                count++;
                continue;
            } else if (o[i] == 'R') {
                count++;
                if (max < count) {
                    max = count;
                }
                count = 0;
                continue;
            }
        }
        System.out.println(max);
    }
}
