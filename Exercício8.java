import java.util.Scanner;
public class Atividade8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] focos = new int[5][5];
        int maiorFocos = 0;
        int regiaoMaiorFocos = 0;

        for (int i = 0; i < focos.length; i++) {
            for (int j = 0; j < focos[i].length; j++) {
                System.out.print("Digite a quantidade de focos de pragas na região " + (i + 1) + ", setor " + (j + 1) + ": ");
                focos[i][j] = scanner.nextInt();

                if (focos[i][j] > maiorFocos) {
                    maiorFocos = focos[i][j];
                    regiaoMaiorFocos = i + 1;
                }
            }
        }
        System.out.println("A região com maior quantidade de focos de pragas é a região " + regiaoMaiorFocos + " com " + maiorFocos + " focos.");
        }
}