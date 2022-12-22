package mirea.practic4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MatchResults extends JFrame{
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    int score1=0,score2=0;
    String lastGoal;
    MatchResults(){
        super("Game");
        setLayout(new FlowLayout());
        setSize(300,150);
        JLabel score = new JLabel(score1+ " X "+ score2+'\n');
        JLabel lastScorer= new JLabel("Last Scorer: N/A\n");
        JLabel leader = new JLabel("Winner: DRAW");
        add(score);
        add(button1);
        add(button2);
        add(lastScorer);
        add(leader);
         button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1+=1;
                lastGoal="AC Milan";
                score.setText(score1+ " X "+ score2+'\n');
                lastScorer.setText("Last Scorer: "+lastGoal+'\n');
                if (score1>score2) leader.setText("Winner: AC Milan");
                else if(score2>score1) leader.setText("Winner: Real Madrid");
                else leader.setText("Winner: DRAW");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score2+=1;
                lastGoal="Real Madrid";
                score.setText(score1+ " X "+ score2+'\n');
                lastScorer.setText("Last Scorer: "+lastGoal+'\n');
                if (score1>score2) leader.setText("Winner: AC Milan");
                else if(score2>score1) leader.setText("Winner: Real Madrid");
                else leader.setText("Winner: DRAW");
            }
        });
    }
    public static void main(String[] args){
        new MatchResults().setVisible(true);
    }
}

