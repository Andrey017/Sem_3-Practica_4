package ru.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Play extends JFrame {
    private int count_1 = 0;
    private int count_2 = 0;

    public Play(){
        JButton button_1 = new JButton("AC Milan");
        JButton button_2 = new JButton("Real Madrid");
        JLabel lb_1 = new JLabel("Result: 0 X 0");
        JLabel lb_2 = new JLabel("Last Scorer: N/A");
        Label lb_3 = new Label("Winner: Draw");

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count_1++;
                String str = "Кнорку нажали раз: " + count_1 + "X" + count_2;
                lb_1.setText(str);
                str = "Last Scorer: AC Milan";
                lb_2.setText(str);
                if (count_1 > count_2){
                    str = "Winner: AC Milan";
                    lb_3.setText(str);
                }
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count_2++;
                String str_2 = "Кнопку нажали раз: " + count_1 + "X" + count_2;
                lb_1.setText(str_2);
                str_2 = "Last Scorer: Real Madrid";
                lb_2.setText(str_2);
                if (count_1 < count_2){
                    str_2 = "Winner: Real Madrid";
                    lb_3.setText(str_2);
                }
            }
        });

        setLayout(new BorderLayout());

        add(button_1, BorderLayout.WEST);
        add(button_2, BorderLayout.EAST);
        add(lb_3, BorderLayout.SOUTH);
        add(lb_1, BorderLayout.NORTH);
        add(lb_2, BorderLayout.CENTER);

        setSize(350, 200);
    }
}
