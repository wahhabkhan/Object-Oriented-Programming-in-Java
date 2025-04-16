import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI{
    public static void main(String[] args) {
       //Create a frame (main window)
       JFrame frame = new JFrame("Simple GUI Example");
       frame.setSize(400, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //create a label
       JLabel label = new JLabel("Enter your name:");
       label.setBounds(20, 20, 125, 25);

       //create a text field
       JTextField textField = new JTextField();
       textField.setBounds(150, 20, 200, 30);

       //create a button
       JButton button = new JButton("Click me");
       button.setBounds(150, 60, 100, 30);

       //create an output label
       JLabel outputLabel = new JLabel();
       outputLabel.setBounds(20, 100, 300, 30);

       //add action listener to the button
       button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String name = textField.getText();
            outputLabel.setText("Hello " + name + "!");
        }
       });

       //add components to the frame
       frame.add(label);
       frame.add(textField);
       frame.add(button);
       frame.add(outputLabel);

       
       //Set layout to null and make the frame visible
       frame.setLayout(null);
       frame.setVisible(true);
    }
}