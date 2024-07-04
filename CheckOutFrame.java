import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOutFrame extends JFrame {

    public CheckOutFrame() {
        setTitle("Check Out");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel roomLabel = new JLabel("Room Number:");
        JTextField roomField = new JTextField();
        JButton checkOutButton = new JButton("Check Out");

        checkOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement check-out logic here
                JOptionPane.showMessageDialog(null, "Checked Out Successfully!");
                dispose();
            }
        });

        add(nameLabel);
        add(nameField);
        add(roomLabel);
        add(roomField);
        add(new JLabel(""));
        add(checkOutButton);

        setVisible(true);
    }
}
