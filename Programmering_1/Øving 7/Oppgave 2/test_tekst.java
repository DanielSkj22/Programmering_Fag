import java.util.Scanner;

public class test_tekst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ting = sc.nextLine();
        String ta = sc.nextLine().toLowerCase();
        String bort = sc.nextLine().toLowerCase();
        tekst obj = new tekst(ting, ta, bort);

        obj.antall();
        obj.gjen();
        obj.fleregjen();
        obj.skifte();
        obj.normal();
        obj.upper();

        sc.close();
    
    }
    
}
