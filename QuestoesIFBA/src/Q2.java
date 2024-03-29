import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double respostaDistancia;
        double respostaPrecoGasolina;
        double gasolinaNecessaria;
        double preco;

        System.out.println("Insira a distância: ");
        respostaDistancia = teclado.nextDouble();

        System.out.println("Insira o preço da gasolina: ");
        respostaPrecoGasolina = teclado.nextDouble();

        gasolinaNecessaria = respostaDistancia / 12;
        preco = respostaPrecoGasolina * gasolinaNecessaria;

        System.out.printf("Você necessitará de %.2fL de gasolina, gastando assim R$%.2f%n", gasolinaNecessaria, preco);

        teclado.close();
    }
}
