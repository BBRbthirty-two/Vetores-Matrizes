import java.util.Scanner;
public class Atividade6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] producao = new int[4][3];
        int[] totalCultura = new int[3];
        for (int i = 0; i < producao.length; i++){
            for (int j = 0; j < producao[i].length; j++){
              System.out.print("Digite a produção da cultura " + (j + 1) + " no mês " + (i + 1) + ": "); 
              producao[i][j] = scanner.nextInt();
              totalCultura[j] += producao[i][j];}}   
            for (int j = 0; j < totalCultura.length; j++)
                {System.out.println("A produção total da cultura " + (j + 1) + " é: " + totalCultura[j]);}
        }
}