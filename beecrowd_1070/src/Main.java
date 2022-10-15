import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int x = leitor.nextInt();
        for (int i = x; i <= (x*3); i++) {
            if (impar < 6) {
                if (i % 2 == 0) {
                    par++;
                } else {
                    System.out.println(i);
                    impar++;
                }
            }
        }
    }
}