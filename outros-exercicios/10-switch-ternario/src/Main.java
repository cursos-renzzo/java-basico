public class Main {
    public static void main(String[] args) {
        char ch;

        String test2 = "abcde";
        String test = new String("abcde");

        if (test.equals(test2)) {
            ch = (test == test2) ? test.charAt(0) : test.charAt(1);

        } else {

            ch = (test == test2) ? test.charAt(2) : test.charAt(3);
        }

        System.out.println(ch);
    }
}