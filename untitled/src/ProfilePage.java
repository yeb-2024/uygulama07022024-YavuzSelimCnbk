import javax.swing.*;
import java.awt.*;

public class ProfilePage {


    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel image = new JLabel();

    public ProfilePage() {

        ImageIcon icon = new ImageIcon("1271214.jpg");
        image.setIcon(icon);
        frame.add(image);

        label.setText("İsim: Fatih Sultan Mehmet");
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));

        frame.add(label);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
    }
}
