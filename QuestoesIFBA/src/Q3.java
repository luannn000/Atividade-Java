import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respostaIdade;

        System.out.println("Quantos anos você tem?");
        respostaIdade = teclado.nextInt();

        if (respostaIdade >= 18) {
            System.out.println("Você pode tirar carteira de motorista!");
        } else {
            System.out.println("Você não pode tirar carteira de motorista!");
        }

        teclado.close();
    }
}
