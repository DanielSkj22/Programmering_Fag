import static javax.swing.JOptionPane.*;
public class Tommer {

    public static void main(String[]args) {
        String tallLest = showInputDialog("Tall (cm):");
        double tall = Double.parseDouble(tallLest);
        double tommer = 2.54;
        double endring = tall/tommer;
        System.out.println(tall +" cm blir til " +endring+ " tommer");
    }
}