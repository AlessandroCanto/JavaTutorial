import javax.swing.*;

public class Window {
    public static void main(String[] args) {

        JFrame frame = new JFrame("hello world");
        //closes the app
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the dimensions of the window
        frame.setSize(800,500);
        //centers the window to centre of the screen
        frame.setLocationRelativeTo(null);
        //makes it visible since it's not by default
        frame.setVisible(true);
    }
}
