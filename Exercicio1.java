import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        escada();
    }

    public static void escada(){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite o número de linhas: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
    
}
