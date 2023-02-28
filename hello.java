import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 public class hello implements ActionListener  {

    
    //needed labels for the GUI
   private static JLabel printhello;
   private static JFrame frame;
   private static JPanel panel;
   private static JLabel label;
   private static JTextField userText;
   private static JButton button;

   //main method to set the user interface
public static void main(String [] args){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel ("Enter your Name");

        label.setBounds(10 ,20 ,175 ,25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(130, 20, 165, 25);
        panel.add(userText);

        button = new JButton("Enter");
        button.setBounds(120, 70,80 ,25);
        button.addActionListener ((ActionListener) new hello());
        panel.add(button);

        printhello = new JLabel("");
        printhello.setBounds(10, 110 ,300 ,25);
        panel.add(printhello);
        frame.setVisible(true);
}

//method to print the hello message when clicking the button
@Override
public void actionPerformed(ActionEvent e){
    String username = userText.getText();
    printhello.setText("Hello " + username + "!");
}

}

