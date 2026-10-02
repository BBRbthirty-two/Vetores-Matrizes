import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] umidade = new int[8];
        int quantidade = 0, umidadeMedia = 0;

        for (int i = 0; i < umidade.length; i++) {
            System.out.print("Informe a umidade de solo na área " + (i + 1) + ": ");

            umidade[i] = scanner.nextInt();
                umidadeMedia = umidade[i];

            if (umidade[i] > 0 || umidade[i] < umidadeMedia * 0.4) {
                quantidade = quantidade + 1;
            }
        }

        System.out.println("A quantidade de áreas inferiores a 40% é: " + quantidade);
    }
}