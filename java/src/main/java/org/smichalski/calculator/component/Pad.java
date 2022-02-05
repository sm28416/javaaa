package org.smichalski.calculator.component;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pad extends JPanel implements ActionListener {
    JButton bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9, bttn0;
    JButton addButton, subButton, mulButton, divButton, equButton, decButton;
    Display display = new Display();
    public Pad(){

        bttn1 = new JButton(String.valueOf(1));
        bttn1.addActionListener(this);

        bttn2 = new JButton(String.valueOf(2));
        bttn2.addActionListener(this);

        bttn3 = new JButton(String.valueOf(3));
        bttn3.addActionListener(this);

        bttn4 = new JButton(String.valueOf(4));
        bttn4.addActionListener(this);

        bttn5 = new JButton(String.valueOf(5));
        bttn5.addActionListener(this);

        bttn6 = new JButton(String.valueOf(6));
        bttn6.addActionListener(this);

        bttn7 = new JButton(String.valueOf(7));
        bttn7.addActionListener(this);

        bttn8 = new JButton(String.valueOf(8));
        bttn8.addActionListener(this);

        bttn9 = new JButton(String.valueOf(9));
        bttn9.addActionListener(this);

        bttn0 = new JButton(String.valueOf(0));
        bttn0.addActionListener(this);

        addButton = new JButton("+");

        subButton = new JButton("-");

        mulButton = new JButton("*");

        divButton = new JButton("/");

        equButton = new JButton("=");

        decButton = new JButton(".");

        this.setLayout(new GridLayout(5,4,10,10));
        this.setPreferredSize(new Dimension(300,350));

        this.add(bttn7);
        this.add(bttn8);
        this.add(bttn9);
        this.add(addButton);
        this.add(bttn4);
        this.add(bttn5);
        this.add(bttn6);
        this.add(subButton);
        this.add(bttn1);
        this.add(bttn2);
        this.add(bttn3);
        this.add(mulButton);
        this.add(decButton);
        this.add(bttn0);
        this.add(divButton);
        this.add(equButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bttn0){
            display.SetText("0");
        }
        if(e.getSource() == bttn1){
            display.SetText("1");
        }
        if(e.getSource() == bttn2){
            display.SetText("2");
        }
        if(e.getSource() == bttn3){
            display.SetText("3");
        }
        if(e.getSource() == bttn4){
            display.SetText("4");
        }
        if(e.getSource() == bttn5){
            display.SetText("5");
        }
    }
}
