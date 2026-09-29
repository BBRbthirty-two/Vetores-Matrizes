import java.util.Scanner;

public class Atividade2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dias = new int[10];
        int maior30 = 0;

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");  
            dias[i] = scanner.nextInt();
            

            if (dias[i] > 30) {
                maior30 = maior30 + 1;
            }
        }
                    System.out.println("A quantidade de dias com temperatura maior que 30 é: " + maior30);

    }
}