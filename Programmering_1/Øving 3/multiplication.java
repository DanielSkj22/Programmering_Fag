import static javax.swing.JOptionPane.*;

public class multiplication {
    public static void main(String[] args) {
        
        String tallLest = showInputDialog("Tall");
        double tall = Double.parseDouble(tallLest);
        double talll = tall+1;
        double tallll = tall+2;
        String higLest = showInputDialog("Hvor høy gange tabell");
        double hig = Double.parseDouble(higLest);
        
    for (int i = 1; i <= hig; i++) {
    System.out.println(tall +  "X" +  i +  "=" +  i * tall);
    }      
    for (int i = 1; i <= hig; i++) {
    System.out.println(talll +  "X" +  i +  "=" +  i * talll);
    }
    for (int i = 1; i <= hig; i++) {
    System.out.println(tallll +  "X" +  i +  "=" +  i * tallll);
    }
    }
}

