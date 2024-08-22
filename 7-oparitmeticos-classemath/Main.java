public class Main {

    public static void main(String[] args) {

        float n1 = 10;
        float n2 = 20;

        float n = (n1 + n2) /2;

        System.out.println("A média de n1 e n2 é: " + n);

        int numero = 10;
        int valor = 4 + --numero;
        System.out.println(valor);
        System.out.println(numero);

        int x = 4;

        x += 2;
        System.out.println(x);

        float v = 8.4f;
        int ar = (int) Math.round(v);
        System.out.println(ar);

        double ale = Math.random();
        n = (int) (5 + ale * (10-5));
        System.out.println(n);


    }
}
