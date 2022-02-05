package org.smichalski.calculator.frame;

import org.smichalski.calculator.component.Command;
import org.smichalski.calculator.component.Display;
import org.smichalski.calculator.component.Pad;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    JPanel content;
    public MainFrame(){
        super("Calculator");
        content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setPreferredSize(new Dimension(400,500));
        Display c1 = new Display();
        c1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Pad c2 = new Pad();
        c2.setAlignmentX(Component.CENTER_ALIGNMENT);

        content.add(c1);
        content.add(c2);
        setContentPane(content);
        pack();
    }
}
