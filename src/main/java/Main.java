import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {
    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do {
            System.out.println("Supermarket");
            System.out.println("1 - Add");
            System.out.println("2 - Print");
            System.out.println("3 - Delete");
            System.out.println("4 - Exit");
            System.out.println("==============================");
            System.out.println("Digite uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do intem");
                    String item = scanner.next();
                    supermarket.add(item);
                    System.out.println("==============================");

                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.println("Digite o index");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    System.out.println("==============================");

                    break;
                case 4:
                    System.out.println("Saindo");
                    System.out.println("==============================");

                    break;
                default:
                    System.out.println("Opcao invalida");
                    System.out.println("==============================");

            }

        } while (opcao != 4);
        scanner.close();
    }
}