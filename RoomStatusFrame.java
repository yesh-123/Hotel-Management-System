import javax.swing.*;
import java.awt.*;

public class RoomStatusFrame extends JFrame {

    public RoomStatusFrame() {
        setTitle("Room Status");
        setSize(300, 200);
        setLayout(new GridLayout(2, 1));

        JTextArea statusArea = new JTextArea();
        statusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(statusArea);

        // Example room status - In real application, fetch from database
        statusArea.setText("Room 101: Booked\nRoom 102: Available\nRoom 103: Checked In");

        add(scrollPane);

        setVisible(true);
    }
}
