import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        switch (c) {

            case "R":
                System.out.println("B");
                break;

            case "B":
                System.out.println("Y");
                break;

            case "Y":
                System.out.println("R");
                break;
        }
    }
}
