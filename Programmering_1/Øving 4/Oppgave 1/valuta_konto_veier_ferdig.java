import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
public class valuta_konto_veier_ferdig {
    public static void main(String [] args){

        boolean run = true;
        valutaer S = new valutaer (1.06);
        valutaer E = new valutaer (11.57);
        valutaer D = new valutaer (9.83);
        double svenk = S.getvaluta();
        double dollar = D.getvaluta();
        double euro = E.getvaluta();


        while (run){
            String hva;
            hva = JOptionPane.showInputDialog("1 For å konvertere fra NOK\n2 For å konvertere til NOK\n3 For avslutt");
            if(hva.equals("3")){
                run = false;
            }
            if (hva.equals("2")){
                String userInput;
                userInput = JOptionPane.showInputDialog("1 For Svensk\n2 For Dollar\n3 For Euro\n4 For avslutt");
                if (userInput.equals("4")){
                    run = false;
                }if (userInput.equals("1")){
                    String nokLest = showInputDialog("Svenske Kroner");
                    Double nok = Double.parseDouble(nokLest);
                    nok = nok*svenk;
                    System.out.println(nok);
                    run = false;}
                    if (userInput.equals("2")){
                        String nokLest = showInputDialog("Dollar");
                        Double nok = Double.parseDouble(nokLest);
                        nok = nok*dollar;
                        System.out.println(nok);
                        run = false;}
                        if (userInput.equals("3")){
                            String nokLest = showInputDialog("Euro");
                            Double nok = Double.parseDouble(nokLest);
                            nok = nok*euro;
                            System.out.println(nok);
                            run = false;}
            }
            if (hva.equals("1")){
                String userInput;
                userInput = JOptionPane.showInputDialog("1 For Svensk\n2 For Dollar\n3 For Euro\n4 For avslutt");
                if (userInput.equals("4")){
                    run = false;
                }if (userInput.equals("1")){
                    String nokLest = showInputDialog("Nok");
                    Double nok = Double.parseDouble(nokLest);
                    nok = nok/svenk;
                    System.out.println(nok);
                    run = false;}
                    if (userInput.equals("2")){
                        String nokLest = showInputDialog("Nok");
                        Double nok = Double.parseDouble(nokLest);
                        nok = nok/dollar;
                        System.out.println(nok);
                        run = false;}
                        if (userInput.equals("3")){
                            String nokLest = showInputDialog("Nok");
                            Double nok = Double.parseDouble(nokLest);
                            nok = nok/euro;
                            System.out.println(nok);
                            run = false;}                
    }
        }
    }
}
