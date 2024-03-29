import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        System.out.println("Digite o primeiro valor: ");
        num1 = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = teclado.nextInt();

        resultado = num1 + num2;

        if (resultado >= 10) {
            resultado += 5;
        } else {
            resultado -= 7;
        }

        System.out.printf("Resultado: %d%n", resultado);

        teclado.close();
    }
}
