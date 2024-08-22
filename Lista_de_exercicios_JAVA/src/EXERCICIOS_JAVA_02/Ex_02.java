package EXERCICIOS_JAVA_02;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Escolha uma operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}