import java.awt.*;

public class Main {
    public static void main(String[] args) {

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        System.out.println("A resolução da sua tela é: " + width + " x " + height);

    }
}