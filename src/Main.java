import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int resto = b - a;
            boolean p = false;
            int[] notas = { 2, 5, 10, 20, 50, 100 };

            if (a == 0 && b == 0) {
                break;
            }

            for (int i = 0; i < notas.length; i++) {
                for (int k = 0; k < notas.length; k++) {
                    if (notas[i] + notas[k] == resto) {
                        p = true;
                    }
                }
            }

            if (p == true) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
        }

    }
}
