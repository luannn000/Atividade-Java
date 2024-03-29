import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double respostaTemperatura;

        System.out.println("Insira a temperatura: ");
        respostaTemperatura = teclado.nextDouble();

        if (respostaTemperatura > 37) {
            System.out.println("Você está febril.");
        } else {
            System.out.println("Sua temperatura está normal.");
        }

        teclado.close();
    }
}
