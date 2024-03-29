import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double respostaPeso;
        double respostaAltura;
        double imc;

        System.out.println("Digite o peso: ");
        respostaPeso = teclado.nextDouble();

        System.out.println("Digite a altura: ");
        respostaAltura = teclado.nextDouble();

        imc = respostaPeso/(respostaAltura * respostaAltura);

        if (imc > 30) {
            System.out.println("Essa pessoa está obesa");
        } else {
            System.out.println("Essa pessoa não está obesa");
        }

        teclado.close();
    }
}
