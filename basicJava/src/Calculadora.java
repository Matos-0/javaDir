import java.util.Objects;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor X: ");
        Double X = sc.nextDouble();

        System.out.print("\nOperador [+ | - | * | %]: ");
        String operacao = sc.next();

        System.out.print("\nValor Y: ");
        Double Y = sc.nextDouble();

        Double resultado = 0.0;

        System.out.print("\nlógica IF-ELSE [1]\nlógica Switch [2]\nEscolha a lógica do programa: ");
        int logicOption = sc.nextInt();

        if (logicOption == 0){
            System.out.println("Informe a lógica a ser utilizada");
        } else {
            switch (logicOption) {
                case 1:
                    if (Objects.equals(operacao, "+")){
                        resultado = X + Y;
                    } else if (Objects.equals(operacao, "-")) {
                        resultado = X - Y;
                    } else if (Objects.equals(operacao, "*")) {
                        resultado = X * Y;
                    } else if (Objects.equals(operacao, "%")) {
                        resultado = X / Y;
                    } else {
                        System.out.println("Insira um operador correto!");
                    }
                    System.out.printf("Resultado %f",resultado);
                    System.out.print("\nCalculo realizado pelo programa com a lógica Switch-Case");
                break;

                case 2:
                    switch (operacao) {
                        case "+":
                            resultado = X + Y;
                            break;
                        case "-":
                            resultado = X - Y;
                            break;
                        case "%":
                            resultado = X / Y;
                            break;
                        case "*":
                            resultado = X * Y;
                            break;
                        default:
                            System.out.println("Insira um operador correto!");
                            break;
                    }
                    System.out.printf("Resultado %f",resultado);
                    System.out.print("\nCalculo realizado pelo programa com a lógica IF-ELSE");
                    break;
                default:
                    System.out.println("Insira uma opção de lógica existente!");
                    break;
            }
        }
        sc.close();
    }

}
