import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("MY Hotel Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton bookRoomButton = new JButton("Book Room");
        JButton checkInButton = new JButton("Check In");
        JButton checkOutButton = new JButton("Check Out");
        JButton roomStatusButton = new JButton("Room Status");

        bookRoomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookRoomFrame();
            }
        });

        checkInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckInFrame();
            }
        });

        checkOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckOutFrame();
            }
        });

        roomStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RoomStatusFrame();
            }
        });

        add(bookRoomButton);
        add(checkInButton);
        add(checkOutButton);
        add(roomStatusButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
