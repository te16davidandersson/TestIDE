import javax.swing.*;

public class TestIDE {
    public static void main(String[] args) {
        String aa = JOptionPane.showInputDialog(null, "Ange ett tal för att få summan.");
        int a = Integer.parseInt(aa);
        String bb = JOptionPane.showInputDialog(null, "Ange ett annat tal för att få summan.");
        int b = Integer.parseInt(bb);

        int ab = a + b;
        JOptionPane.showMessageDialog(null, "Summan: " + ab);
    }
}
