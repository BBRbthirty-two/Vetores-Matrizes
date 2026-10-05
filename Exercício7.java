import java.util.Scanner;
public class Atividade7 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] chuva = new int[7][4];
        int[] totalChuva = new int[4];
        for (int i = 0; i < chuva.length; i++) {
            for (int j = 0; j < chuva[i].length; j++) {
                System.out.print("Digite a quantidade de chuva na área " + (j + 1) + " no dia " + (i + 1) + ": ");
                chuva[i][j] = scanner.nextInt();
                totalChuva[j] += chuva[i][j];}}

        System.out.println("Total de chuva por área:");
        for (int j = 0; j < totalChuva.length; j++) {
            System.out.println("Área " + (j + 1) + ": " + totalChuva[j]);
        }

}
}