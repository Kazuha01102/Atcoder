import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A + B == 9 || A - B == 9 || A * B == 9 || A / B == 9 && A % B == 0) {
            System.out.println("Nine");
        } else {
            System.out.println("Nein");
        }
    }
}
