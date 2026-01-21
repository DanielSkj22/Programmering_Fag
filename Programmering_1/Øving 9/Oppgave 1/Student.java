import java.util.Scanner;

public class Student {
    
    private String navn;
    private int antOppg;
    private Scanner sc = new Scanner(System.in);

    public String getNavn(){
            navn = sc.nextLine();
            return navn;
        }
    public int getAntOppg(){
            return antOppg;
        }
    public void økAntOppg(){
        antOppg = 0;
        int antall = sc.nextInt(); 
        antOppg = antOppg + antall;
    }
    public String toString(){
        return navn + " "+ antOppg;
}
}

