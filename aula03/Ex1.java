import javax.swing.*;

public class Ex1 {
    
    //utilizando loço de repetição no java, faça com que os 8 primeiros números da sequencia de fibonacci sejam calculados e exibidos!
    //ex.:0 1 1 2 3 5 8 13

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        String output = "";
        for (int i = 0; i < 8; i++) {
            int na = n1 + n2;
            n1 = n2;
            n2 = na;
            output = output + " " + Integer.toString(n1);
        }

        JOptionPane.showMessageDialog(null, output);

    }
}
