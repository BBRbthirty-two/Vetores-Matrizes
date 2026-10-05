import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int [] plantacao = new int [12];
            int maiorplantacao = 0;
            int diaMaiorplantacao = 0;
        for (int i = 0; i < plantacao.length; i++) {
            System.out.print("Digite o consumo de setor " + (i + 1) + " de plantação: ");  
            plantacao[i] = scanner.nextInt();
            if (plantacao[i] > maiorplantacao) {
                maiorplantacao = plantacao[i];
                diaMaiorplantacao = i + 1;
            }
        }
        System.out.println("O maior consumo registrado foi: " + maiorplantacao + " no dia " + diaMaiorplantacao);     

        }
}
