import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior%n", num1);
        } else if (num2 > num1) {
            System.out.printf("O número %d é maior%n", num2);
        } else {
            System.out.println("Os números são iguais");
        }

        teclado.close();
    }
}
