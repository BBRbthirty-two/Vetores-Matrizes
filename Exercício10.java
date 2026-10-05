import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] producao = new int[4][12];
        int[] totalProducao = new int[4];
        int maiorProducao = 0;
        int pomarMaiorProducao = 0;
      for (int i = 0; i < producao.length; i++) {
           for (int j = 0; j < producao[i].length; j++) {
                System.out.print("Digite a produção do pomar " + (i + 1) + " no mês " + (j + 1) + ": ");
                producao[i][j] = scanner.nextInt();
                totalProducao[i] += producao[i][j];}}
      for (int i = 0; i < totalProducao.length; i++) {
           if (totalProducao[i] > maiorProducao) {
                maiorProducao = totalProducao[i];
                pomarMaiorProducao = i + 1;}}
        System.out.println("O pomar com maior produção anual é o pomar " + pomarMaiorProducao + " com " + maiorProducao + " unidades de frutas.");
    }
}