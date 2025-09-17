import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Insira um Nome: ");
        String Name = sc.next();
        System.out.println("Insira a sua Idade: ");
        int Idade = sc.nextInt();
        System.out.println("Você Trabalha?");
        boolean Trabalha = sc.nextBoolean();
        double Salario = 0.0;

        if (Trabalha){
            System.out.println("Qual o seu salário?");
            Salario = sc.nextDouble();
        }

        System.out.printf("Nome: %s\nIdade: %d\nTrabalha?:%b\nSalario:%f", Name, Idade, Trabalha, Salario);

        sc.close();
    }
}