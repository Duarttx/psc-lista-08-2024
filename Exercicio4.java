import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite o primeiro número: ");
        num = input.nextInt();
        
        PosNeg(num);

        input.close();
    }

    public static void PosNeg(int num){

        char positivo = 'P', negativo = 'N';


        if (num < 0) {
            System.out.println(negativo);
        }else{
            System.err.println(positivo);
        }
        
    }
}