package com.nanlagger.ui;

import javax.swing.*;

/**
 * Created by NaNLagger on 07.03.15.
 *
 * @author Stepan Lyashenko
 */
public class HelpWindow extends JFrame{
    private JTextArea helpTextArea;
    private JPanel panel1;

    public HelpWindow() {
        super();
        setSize(400, 200);
        setTitle("Справка");
        setContentPane(panel1);
        setVisible(true);
    }
}
