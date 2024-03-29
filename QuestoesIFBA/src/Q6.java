import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Digite a nota da primeira prova: ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        nota2 = teclado.nextDouble();

        System.out.println("Digite a nota do trabalho: ");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}
