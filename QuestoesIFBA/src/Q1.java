import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resposta;
        double salario;

        System.out.println("Digite o salário do operário: ");
        resposta = teclado.nextDouble();

        salario = resposta * 20;

        System.out.println("O salário do operário será de R$" + salario);
    }
}