package mirea.lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
    JLabel a = new JLabel("CENTER",SwingConstants.CENTER);
    JLabel b = new JLabel("WEST");
    JLabel c = new JLabel("SOUTH",SwingConstants.CENTER);
    JLabel d = new JLabel("NORTH",SwingConstants.CENTER);
    JLabel e = new JLabel("EAST");

    public Test(){
        super("Test");
        setSize(200,140);
        setLayout(new BorderLayout());
        add(a,BorderLayout.CENTER);
        add(b,BorderLayout.WEST);
        add(c,BorderLayout.SOUTH);
        add(d,BorderLayout.NORTH);
        add(e,BorderLayout.EAST);
        a.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event){
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ");
            }
        });
        b.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event){
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }
        });
        c.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event){
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }
        });
        d.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event){
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Норильск");
            }
        });
        e.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent event){
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }
        });
    }
    public static void main(String[]args)
    {
        new Test().setVisible(true);
    }
}
