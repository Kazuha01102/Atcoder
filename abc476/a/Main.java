import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int n = S.length();

        if (S.charAt(n - 1) == 'e') {
            System.out.println(S + "r");
        } else {
            System.out.println(S + "er");
        }
    }
}
