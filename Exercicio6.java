import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continua;

        do {
            System.out.print("Digite a hora (formato 24 horas): ");
            int hora = input.nextInt();
            System.out.print("Digite os minutos: ");
            int minutos = input.nextInt();

            String resultado = converterPara12Horas(hora, minutos);
            System.out.println("Hora em formato 12 horas: " + resultado);

            System.out.print("Deseja continuar? (S/N): ");
            continua = input.next().charAt(0);
        } while (continua == 'S' || continua == 's');

        input.close();
    }

    public static String converterPara12Horas(int hora, int minutos) {
        String periodo;
        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
            hora -= 12;
        }
        if (hora == 0) {
            hora = 12; 
        }
        return hora + ":" + minutos + " " + periodo;
    }
}