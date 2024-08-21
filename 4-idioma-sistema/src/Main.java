import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale locale = new Locale(System.getProperty("user.language"), System.getProperty("user.country"));

        System.out.println("O seu sistema está em " + locale);

    }
}