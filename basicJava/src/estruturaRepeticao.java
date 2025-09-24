import java.util.Scanner;

// Estrutura for

public class estruturaRepeticao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int number = input.nextInt();
        String question;

        for (int n = 0; n <= number; n++) {
            if (n % 2 == 0) {

                System.out.printf("Iterar número par %d?", n);
                question = input.next();

                if (question.equalsIgnoreCase("S")) {
                    System.out.printf("Número %d iterado com sucesso!\n", n);
                } else if (question.equalsIgnoreCase("N")) {
                    System.out.printf("Número %d não foi iterado!\n", n);
                }
            }
        }
        input.close();
    }

}
