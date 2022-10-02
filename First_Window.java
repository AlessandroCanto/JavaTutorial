import javax.swing.*;

public class Window {
    //main method
    public static void main(String[] args) {
        //creates the window object and a title is assigned
        JFrame frame = new JFrame("hello world");
        //stops running the code
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the dimensions of the window
        frame.setSize(800,500);
        //centers the window to centre of the screen
        frame.setLocationRelativeTo(null);
        //makes it visible since it's not by default
        frame.setVisible(true);
    }
}
