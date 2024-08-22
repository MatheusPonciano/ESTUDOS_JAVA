package EXERCICIOS_JAVA_02;
import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        sc.close();
    }
}
