import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] fertilidade = new double[6][6];
        double[] mediaLinha = new double[6];

        for (int i = 0; i < fertilidade.length; i++) {
            for (int j = 0; j < fertilidade[i].length; j++) {
                System.out.print("Digite o índice de fertilidade para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                fertilidade[i][j] = scanner.nextDouble();
                mediaLinha[i] += fertilidade[i][j];
            }
            mediaLinha[i] /= fertilidade[i].length;
        }
        for (int i = 0; i < mediaLinha.length; i++) {
            System.out.println("A média de fertilidade da linha " + (i + 1) + " é: " + mediaLinha[i]);
        }
    }
}