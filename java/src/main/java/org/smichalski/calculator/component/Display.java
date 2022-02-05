package org.smichalski.calculator.component;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    JTextField display;

    public Display(){
        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        this.add(display);
        this.setLayout(new GridLayout(1,0));
        this.setPreferredSize(new Dimension(300,50));
    }
    public void SetText(String text){
        display.setText(display.getText().concat(String.valueOf(text)));
    }
}
