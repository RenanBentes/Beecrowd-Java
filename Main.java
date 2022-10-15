import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int par = 0;
        int x = leitor.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0){
                par++;
            }
            else
                System.out.println(i);
        }
    }
}