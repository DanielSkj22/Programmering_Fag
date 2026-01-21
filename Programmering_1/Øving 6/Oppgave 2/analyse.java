import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class analyse {
public String text;
public Scanner sc = new Scanner(System.in);
public char temp;
public double charCount = 0;
public double symbolCount = 0;
public String out = sc.nextLine().toLowerCase(); 

    public analyse(String text){
        this.text = text;
        sc.close();
    }
    public void antallBok(){
        for (int i=0; i < text.length(); i++){
            temp = text.charAt(i);
            int numcode = temp;
        if (numcode > 96 && numcode < 123)
            charCount += 1;
        else{
            symbolCount += 1;
    }
    }
    System.out.println("Antall bokstaver = "+charCount);
}
    public void prosent(){
        System.out.printf("Prosent symboler "+"%.2f",(symbolCount/charCount)*100);
        System.out.println(" ");
    }
    public void antallTyper(){
        double types = 0;
        List<Integer> list = new ArrayList<>();
    for (int i=0; i < text.length(); i++){
        temp = text.charAt(i);
        int numcode = temp;
    if(!list.contains(numcode))
    if (numcode > 96 && numcode < 123)
        list.add(numcode);
        types = list.size();
    }
    System.out.println("Antall typer bokstaver = "+types);
}
public void enType(){
    char te;
    double enbok = 0;
        for (int i=0; i < text.length(); i++){
            te = out.charAt(0);
            temp = text.charAt(i);
            int numcode = temp;
            int num = te;
        if (numcode > 96 && numcode < 123)
        if (numcode == num)
            enbok += 1;
    }
    System.out.println("Antall av en bestemt = "+enbok);
}
    public void antallMest() {
        int maxtelle = 0;
        int[] teller = new int[30];
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            int numcode = (int) temp;
        if (numcode > 96 && numcode < 123) {
            teller[numcode - 97]++;
        }
    }
    for (int telle : teller) {
        if (telle > maxtelle) {
            maxtelle = telle;
        }
    }
    StringBuilder samme = new StringBuilder(); 
        for (int i = 0; i < 30; i++) {
            if (teller[i] == maxtelle) {
                samme.append((char)(i + 97)).append(" ");
        }
    }
    System.out.println("Mest brukte bokstav/er " + samme.toString().trim()+" "+maxtelle + " ganger.");
}
}

