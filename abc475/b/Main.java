import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double thousand = 10;
        int exponent = 100;
        double result = Math.pow(thousand, exponent);
        int N = sc.nextInt();
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int one = 0;
            int ten = 0;
            int hundred = 0;
            int oturi = 0;
            if (A / 1000 == 0) {
                oturi = 1000 - A;
                hundred = oturi / 100;
                oturi = oturi % 100;
                ten = oturi / 10;
                one = oturi % 10;
                if (oturi / 100 == 0) {
                    oturi = 1000 - A;
                    hundred = oturi / 100;
                    oturi = oturi % 100;
                    ten = oturi / 10;
                    one = oturi % 10;
                    if (oturi / 10 == 0) {
                        oturi = 1000 - A;
                        hundred = oturi / 100;
                        oturi = oturi % 100;
                        ten = oturi / 10;
                        one = oturi % 10;
                    } else {
                        oturi = 1000 - A;
                        hundred = oturi / 100;
                        oturi = oturi % 100;
                        ten = oturi / 10;
                        one = oturi % 10;
                    }
                } else {
                    oturi = 1000 - A;
                    hundred = oturi / 100;
                    oturi = oturi % 100;
                    ten = oturi / 10;
                    one = oturi % 10;
                }
            } else {
                if (A % 1000 == 0) {
                    continue;
                }
                if (A >= 10000) {
                    A = (A - ((A / 10000) * 10000));
                }
                oturi = A % 1000;
                oturi = 1000 - oturi;
                hundred = oturi / 100;
                oturi = oturi % 100;
                ten = oturi / 10;
                one = oturi % 10;
            }
            ans1 = one + ans1;
            ans2 = ten + ans2;
            ans3 = hundred + ans3;
        }
        System.out.println(ans1 + " " + ans2 + " " + ans3);

    }

}
