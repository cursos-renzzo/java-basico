import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO");
        int numero = scanner.nextInt();

        for(int i = 1; i <= numero; i+=2) {
            System.out.print(i + " ");
        }

    }
}