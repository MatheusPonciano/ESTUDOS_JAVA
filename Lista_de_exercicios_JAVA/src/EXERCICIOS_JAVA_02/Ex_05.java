package EXERCICIOS_JAVA_02;
import java.util.Scanner; 

public class Ex_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a moeda para converter:");
        System.out.println("1. Dólar para Real");
        System.out.println("2. Euro para Real");
        System.out.println("3. Real para Dólar");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = sc.nextDouble();

        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = valor * 5.00; // Taxa de câmbio fictícia
                break;
            case 2:
                resultado = valor * 5.50; // Taxa de câmbio fictícia
                break;
            case 3:
                resultado = valor / 5.00; // Taxa de câmbio fictícia
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return;
        }

        System.out.println("Valor convertido: " + resultado);
        sc.close();
    }
}
