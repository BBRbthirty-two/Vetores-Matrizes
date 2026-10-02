import java.util.Scanner;
public class Atividade4 {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int []talhoes = new int[5];
            int quantidade = 0;
            int total = 0;
       
       for (int i = 0; i < talhoes.length; i++) {
       System.out.print("Informe a produção de hortaliças do talhão " + (i + 1) + ": ");  
        talhoes[i] = scanner.nextInt();
        
        if (talhoes[i] > 0){
            quantidade = talhoes[i];
            total = total + quantidade;
        };
        }
        System.out.println("A quantidade total de hortaliças produzidas é: " + total);
    }
}