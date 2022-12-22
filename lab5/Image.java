package mirea.lab5;
import java.awt.*;
import javax.swing.*;
public class Image {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Image Demonstration");
        ImageIcon icon = new ImageIcon ("/Users/Yuriy/Downloads/1.jpg");
        JPanel panel = new JPanel();
        panel.setPreferredSize (new Dimension (1000, 700));
        frame.getContentPane().add(panel);
        JLabel label3 = new JLabel (icon, SwingConstants.CENTER);
        panel.add(label3);
        frame.pack();
        frame.setVisible(true);
    }}