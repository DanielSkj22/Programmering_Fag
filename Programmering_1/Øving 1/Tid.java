import static javax.swing.JOptionPane.*;
public class Tid {

    public static void main(String[]args) {
        String sekunderLest = showInputDialog("Sekunder (s):");
        String minutterLest = showInputDialog("Minutter (m):");
        String timerLest = showInputDialog("Timer (h):");
        
        double sekunder = Double.parseDouble(sekunderLest);
        double minutter = Double.parseDouble(minutterLest);
        double timer = Double.parseDouble(timerLest);
        double endring = 60;
        
        double antall = sekunder+minutter*endring+timer*endring*endring;
        System.out.println(antall);
    }
}