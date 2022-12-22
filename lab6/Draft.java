package mirea.lab6;

import java.awt.*;
import javax.swing.*;
import mirea.lab6.*;
public class Draft extends JFrame
{
    public Draft()
    {
        super("BorderLayoutTest");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(250, 250);
        Container container = getContentPane();
        container.add(new JButton("Север" ), "North");
        container.add(new JButton("Юг"    ), "South");
        container.add(new JLabel ("Запад" ), BorderLayout.WEST);
        container.add(new JLabel ("Восток"), BorderLayout.EAST);
        container.add(new JButton("Центр"));

        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Draft();
    }
}
