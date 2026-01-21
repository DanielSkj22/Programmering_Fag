import java.util.Scanner;

public class tekst {
    public Scanner sc = new Scanner(System.in);
    public String ting;
    public String ta;
    public String bort;
    public String[] ja;
    public int resu;
    public String p;
    public tekst(String ting, String ta, String bort){
        this.ting = ting;
        this.ta = ta;
        this.bort = bort;
        sc.close();
    }
    public void antall(){
        String regex = " ";
        String[] me = ting.split(regex);
        int lengde = me.length;
        System.out.println("Det er " + lengde + " antall ord");
        }
    public void gjen(){
        String regex = " ";
        String[] me = ting.split(regex);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            String l = me[i];
            resu += l.length();
        }
        double snitt = resu /lengde;
        System.out.print("Gjennomsnittlig ordlengde er ");
        System.out.printf("%.2f%n",snitt);
    }
    public void fleregjen(){
        String regex = " ";
        String regex1 = "[.:!?]";
        double len = 0;
        String[] me = ting.split(regex1);
        double lengde = me.length;
        for(int i = 0; i < lengde; i++){
            String h[] = me[i].split(regex);
            len += h.length;
            if(i > 0){
                len = len-1;
            }
        }
        double snitt = len /lengde;
        System.out.print("Gjennomsnittlig ordmengde i hver periode ");
        System.out.printf("%.2f%n",snitt);
    }
    public void skifte(){
        String mindre = ting.toLowerCase();
        String regex = " ";
        String[] ja = ta.split(regex);
        String[] me = mindre.split(regex);
        double lengde = me.length;
        System.out.print("Utskift: ");
        for(int i = 0; i < lengde; i++){
            if(me[i].equals(ja[0])){
                System.out.print(bort + " ");
            }
            else{
                System.out.print(me[i] + " ");
            }
        }
        System.out.println();
    }
    public void normal(){
        System.out.print("Normal: ");
        System.out.println(ting);
    }
    public void upper(){
        String upper = ting.toUpperCase();
        System.out.print("Caps lock: ");
        System.out.println(upper);
    }
}
    


