import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] producao = new int[7];
        int soma = 0;
        int maiorProducao = 0;
        int diaMaiorProducao = 0;

        for (int i = 0; i < producao.length; i++) {
            System.out.print("Digite a produção de milho da semana " + (i + 1) + ": ");
            producao[i] = scanner.nextInt();
            soma += producao[i];

            if (producao[i] > maiorProducao) {
                maiorProducao = producao[i];
                diaMaiorProducao = i + 1;
            }
        }

        float mediaSemanal = (float) soma / producao.length;
        System.out.println("A média semanal de produção de milho é: " + mediaSemanal);
        System.out.println("A maior produção registrada foi: " + maiorProducao + " na semana " + diaMaiorProducao);     



    }
}
