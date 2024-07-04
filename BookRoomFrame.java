import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookRoomFrame extends JFrame {

    public BookRoomFrame() {
        setTitle("Book Room");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel roomLabel = new JLabel("Room Number:");
        JTextField roomField = new JTextField();
        JButton bookButton = new JButton("Book");

        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement booking logic here
                JOptionPane.showMessageDialog(null, "Room Booked Successfully!");
                dispose();
            }
        });

        add(nameLabel);
        add(nameField);
        add(roomLabel);
        add(roomField);
        add(new JLabel(""));
        add(bookButton);

        setVisible(true);
    }
}
