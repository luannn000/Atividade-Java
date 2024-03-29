import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro valor: ");
        num1 = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = teclado.nextInt();

        if (num1 + num2 > 10) {
            System.out.println("A soma dos dois valores é maior que 10");
            System.out.printf("Resultado: %d%n", num1 + num2);
        } else if (num1 + num2 == 10) {
            System.out.println("A soma dos dois valores é igual 10");
        } else {
            System.out.println("A soma dos dois valores é menor que 10");
        }

        teclado.close();
    }
}
