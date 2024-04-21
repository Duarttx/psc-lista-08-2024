import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double custo, imposto, impostoporc;

        System.out.print("Digite o custo da venda sem imposto: ");
        custo = input.nextInt();
        System.out.print("Digite o imposto da venda: ");
        imposto = input.nextInt();

        impostoporc = imposto / 100;
        
        somaImposto(custo, impostoporc);
        input.close();
    }

    public static void somaImposto(double custo, double impostoporc){
        double custoTotal;

        custoTotal = custo + (custo * impostoporc);

        System.out.println("O preço total das vendas é: " + custoTotal);
    }
}