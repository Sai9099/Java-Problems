import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        frame.setSize(300, 300);
	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Click Me!");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
                JOptionPane.showMessageDialog(null, "You clicked the button!");
            }
        });
        
        frame.add(button);
        
        frame.setVisible(true);
	
    }
}
