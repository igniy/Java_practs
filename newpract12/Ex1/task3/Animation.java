package mirea.newpract12.Ex1.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Animation extends JFrame {


    public Animation() throws Exception {

        super("Animation");
        setLayout(new BorderLayout());
        setSize(1920, 1080);
        this.getContentPane().setBackground( Color.BLACK );


        Image[] frames = {
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_00_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_01_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_02_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_03_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_04_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_05_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_06_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_07_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_08_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_09_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_10_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_11_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_12_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_13_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_14_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_15_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_16_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_17_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_18_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_19_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_20_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_21_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_22_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_23_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_24_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_25_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_26_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_27_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_29_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_30_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_31_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_32_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_33_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_34_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_35_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_36_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_37_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_38_delay-0.07s.gif")),
                ImageIO.read(new File("C:/Users/Yuriy/IdeaProjects/practic1/src/mirea/newpract12/Ex1/task3//images/frame_39_delay-0.07s.gif")),
        };

        BufferedImage img = null;

        JToggleButton btn = new JToggleButton("Start");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.gray);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel jp = new JPanel(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(frames[0]));
        add(label, BorderLayout.CENTER);
        jp.add(btn, BorderLayout.CENTER);
        add(jp, BorderLayout.NORTH);

        ActionListener animate = new ActionListener() {

            public int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                label.setIcon(new ImageIcon(frames[index]));
            }
        };
        final Timer timer = new Timer(25, animate);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start();
                    btn.setForeground(Color.WHITE);
                } else {
                    btn.setText("Start");
                    timer.stop();
                    btn.setForeground(Color.gray);
                }

            }
        });
        UIManager.put("ToggleButton.select", Color.BLACK);
        SwingUtilities.updateComponentTreeUI(btn);
    }

    public static void main(String[] args) throws Exception {
        new Animation().setVisible(true);
    }
}
