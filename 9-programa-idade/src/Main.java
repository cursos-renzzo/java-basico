import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu (digite, por exemplo: '2000'): ");
        int anoNascimento = scanner.nextInt();

        int idade = 2024 - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade");
        }

        System.out.println("Sua idade é: " + idade);
    }
}