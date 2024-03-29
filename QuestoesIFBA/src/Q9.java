import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double respostaValorHora;
        double respostaHoraMes;
        double respostaDesconto;
        double salarioBruto;
        double salarioLiquido;

        System.out.println("Digite o valor da hora aula: ");
        respostaValorHora = teclado.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        respostaHoraMes = teclado.nextDouble();

        System.out.println("Digite o valor do desconto do INSS (Em porcentagem): ");
        respostaDesconto = teclado.nextDouble();

        salarioBruto = respostaValorHora * respostaHoraMes;
        salarioLiquido = salarioBruto - (salarioBruto * (respostaDesconto / 100));

        System.out.println(String.format("O salário liquído é de R$%.2f", salarioLiquido));
    }
}
