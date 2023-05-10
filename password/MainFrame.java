package password;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public static void main(String[] args) {
        
        // kann gerne noch geändert werden

        JFrame frame = new JFrame("Passwort Generator");
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.blue.darker().darker().darker().darker().darker());

        JLabel welcomeLabel = new JLabel("Welcome");

        panel.add(welcomeLabel);
        frame.add(panel);
        frame.setVisible(true);
    }


}
