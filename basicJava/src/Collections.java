import java.util.*;

public class CollectionTest {

    public static void main(String[] args){

        List<String> CollList = new ArrayList<>();

        Set<String> CollSet = new HashSet<>();

        Queue<String> CollQueue = new LinkedList<>();

        Deque<String> CollDeque = new ArrayDeque<>();

        Map<String, String> CollMap = new HashMap<>();

        Scanner sc  = new Scanner(System.in);

        System.out.println(
                "Escolha uma Collection para exemplificar:"
                + "\n[1] -> List<>"
                + "\n[2] -> Set<>"
                + "\n[3] -> Queue<>"
                + "\n[4] -> Deque<>"
                + "\n[5] -> Map<>"
                + "\nInsira sua opção:"
        );
        int collChoice =  sc.nextInt();

        switch (collChoice) {
            case 1 :
                CollList.add("Valor");
                for (String item : CollList) {
                    System.out.printf("Opção %d : Exemplo da Collection: %s",collChoice, item);
                }
                break;
            case 2:
                CollSet.add("Valor");
                for (String item : CollSet) {
                    System.out.printf("Opção %d : Exemplo da Collection: %s", collChoice, item);
                }
                break;
            case 3:
                CollQueue.add("Valor");
                for (String item : CollQueue) {
                System.out.printf("Opção %d : Exemplo da Collection: %s",collChoice, item);
                }
                break;
            case 4:
                CollDeque.add("Valor");
                for (String item : CollDeque) {
                    System.out.printf("Opção %d : Exemplo da Collection: %s", collChoice, item);
                }
                break;
            case 5:
                CollMap.put("Chave1", "Valor1");
                CollMap.put("Chave2", "Valor2");
                for (Map.Entry<String, String> item : CollMap.entrySet()) {
                    System.out.printf("\nOpção %d : Exemplo da Collection: %s : %s", collChoice, item.getKey(), item.getValue());
                }
                break;
        }
        sc.close();
    }

}
