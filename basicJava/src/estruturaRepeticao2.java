import java.util.Scanner;

// Estrutura While

public class estruturaRepeticao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Insira um número (0 para Sair):");
            int n;
            int counter = 0;
            n = sc.nextInt();

            while (n != 0) {
                counter++;
                n = sc.nextInt();
            }

            System.out.printf("Quantidade de números inserídos: %d", counter);
    }

}
