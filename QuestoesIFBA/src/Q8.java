import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double respostaRaio;
        double area;

        System.out.println("Digite o raio do circunferência: ");
        respostaRaio = teclado.nextDouble();

        area = Math.PI * (respostaRaio * respostaRaio);

        System.out.println(String.format("Área da circunferência: %.2f", area));
    }
}
