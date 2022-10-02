import javax.swing.*;

public class Button extends JFrame {
    //extends JFrame class instead of having to initalize it
    JFrame f;
    public Button() {
        JButton button = new JButton("Press");
        button.setBounds(150,150,100,50);
        //x, y indicate the position, w and h indicate the size of the button
        //adds button to frame
        add(button);
        //window size
        setSize(500,500);
        //no specified layout
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Button();
    }
}
