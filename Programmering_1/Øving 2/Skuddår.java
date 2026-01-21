import static javax.swing.JOptionPane.*;

public class Skuddår {
public static void main(String args[])
    {
        String iLest = showInputDialog("Hvilket år");
        double i = Double.parseDouble(iLest);
        
        int x = 4;
        int y = 400;

        double leap = i%x;
        double century = i%y;
        if ((leap == 0 && 0 != i % 100) || (0==century))
            System.out.println("Det er skuddår");
        else
            System.out.println("Det er ikke skuddår");    

        
    }
}