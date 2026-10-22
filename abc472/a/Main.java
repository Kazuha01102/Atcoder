import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = S.length();

        for (int i = 0; i < count; i++) {
            S.charAt(i);
            if (S.charAt(i) == 'A') {
                System.out.print("A");
            } else {
                System.out.print(".");
            }
        }
    }
}
