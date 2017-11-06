/*
*David Andersson 6/11 2017
*Gissa talet (1-100)
 */
import javax.swing.*;

public class TestIDE {
    public static void main(String[] args) {
        String bb = JOptionPane.showInputDialog(null, "Gissa heltalet (0-100)");
        int b = Integer.parseInt(bb);
        int a = (int) (Math.random()* 100);
        if(b == a) {
            JOptionPane.showMessageDialog(null,"Du gissade rätt");
        }
        else if (b < a) {
            JOptionPane.showMessageDialog(null, "Du gissade för litet");
        }
        else if (b > a) {
            JOptionPane.showMessageDialog(null, "Du gissade för stort");
        }
    }
}