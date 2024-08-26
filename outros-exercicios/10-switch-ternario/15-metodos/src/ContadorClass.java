public class ContadorClass {

    static String contadorMethod(int c, int f){
        String s = " ";
        for(int i = c; c <= f; c++ ){
            s += c + " ";
            System.out.println();
        }

        return s;
    }

}
