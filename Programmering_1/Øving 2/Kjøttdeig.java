import static javax.swing.JOptionPane.*;

public class Kjøttdeig  {
public static void main(String args[])
    {
        String prisaLest = showInputDialog("Pris til første kjøttdeig");
        String vektaLest = showInputDialog("Vekt i kg på første kjøttdeig");
        String prisbLest = showInputDialog("Pris til andre kjøttdeig");
        String vektbLest = showInputDialog("Vekt i kg på andre kjøttdeig");

        double prisa = Double.parseDouble(prisaLest);
        double vekta = Double.parseDouble(vektaLest);
        double prisb = Double.parseDouble(prisbLest);
        double vektb = Double.parseDouble(vektbLest);

        double kiloa = prisa/vekta;
        double kilob = prisb/vektb;
    
        if (kiloa < kilob)
            System.out.println("Kjøtt a er billigere");
        else
            System.out.println("Kjøtt b er billigere");
    }
}

