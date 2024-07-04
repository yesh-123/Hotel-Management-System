import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckInFrame extends JFrame {

    public CheckInFrame() {
        setTitle("Check In");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel roomLabel = new JLabel("Room Number:");
        JTextField roomField = new JTextField();
        JButton checkInButton = new JButton("Check In");

        checkInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement check-in logic here
                JOptionPane.showMessageDialog(null, "Checked In Successfully!");
                dispose();
            }
        });

        add(nameLabel);
        add(nameField);
        add(roomLabel);
        add(roomField);
        add(new JLabel(""));
        add(checkInButton);

        setVisible(true);
    }
}
