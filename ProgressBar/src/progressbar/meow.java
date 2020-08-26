/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author hoald
 */
public class meow extends JPanel {

    JProgressBar pbar;
    static JLabel meo;
    static final int MY_MINIMUM = 0;

    static final int MY_MAXIMUM = 100;

    public meow() {
        pbar = new JProgressBar();
        meo = new JLabel();
        meo.setBounds(75, 75, 500, 100);
        meo.setFont(new Font(meo.getName(), Font.PLAIN, 18));
        pbar.setBounds(50, 50, 500, 25);
        
//        pbar.setStringPainted(true);
        this.add(pbar);
       
        pbar.setMinimum(MY_MINIMUM);
        pbar.setMaximum(MY_MAXIMUM);
        this.setLayout(null);
        add(pbar);
        add(meo);
    }

    public void updateBar(int newValue) {
        pbar.setValue(newValue);
    }

    public static void main(String args[]) {

        final meow it = new meow();

        JFrame frame = new JFrame("Progress Bar Example");
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setContentPane(it);
        frame.setContentPane(it);
        frame.setVisible(true);

        for (int i = MY_MINIMUM; i <= MY_MAXIMUM; i++) {
            final int percent = i;
            meo.setText("Operating is loadinggggggggggggggggggggg "+i+" %");
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        it.updateBar(percent);
                         
                    }
                });
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
