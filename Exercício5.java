import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] umidade = new int[8];
        int contador = 0;
        for (int i = 0; i < umidade.length; i++) {
            System.out.print("Digite a umidade da área " + (i + 1) + ": ");
            umidade[i] = scanner.nextInt();
            if (umidade[i] < 40) {
                contador++;} 
        } while (contador < 0 || contador > 8) {
            System.out.println("A quantidade de áreas com umidade inferior a 40% deve ser entre 0 e 8.");
            System.out.print("Digite novamente a quantidade de áreas com umidade inferior a 40%: ");
            contador = scanner.nextInt();
        }
        System.out.println("A quantidade de áreas com umidade inferior a 40% é: " + contador);
    }
}