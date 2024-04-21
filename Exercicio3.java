import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();

        soma(numero1, numero2, numero3);

        input.close();
    }

    public static void soma(int numero1, int numero2, int numero3){
        int soma = numero1 + numero2 + numero3;
        System.out.println("A soma dos números é: " + soma);
    }
}