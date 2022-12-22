package mirea.practic4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    //JTextArea jta1 = new JTextArea(10,20);
    //JButton button = new JButton("Add some Text");
    //JScrollPane jScroll = new JScrollPane(jta1);
    Font fnt = new Font("Times new roman",Font.BOLD,70);
    public TextAreaExample()
    {
        super("Oskorblenie");
        setSize(600,200);
        setLayout(new FlowLayout());
        JLabel obzivatelstvo = new JLabel("Сама ты лох!");
        obzivatelstvo.setFont(fnt);
        obzivatelstvo.setForeground(Color.YELLOW);
        add(obzivatelstvo);
//        add(jta1);
//        add(button);
//        button.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                String txt = JOptionPane.showInputDialog(null,"Insertsome text");
//                        jta1.append(txt);
//            }
//        });
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}
