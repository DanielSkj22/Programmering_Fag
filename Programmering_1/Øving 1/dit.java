import java.util.Scanner;
public class dit {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int sekunder = sc.nextInt();
        int endring = 60;
        int restmin = (sekunder/endring)%endring;
        int restsek = sekunder%endring;
        int timer   = (sekunder/endring)/endring;
       
        
        
        System.out.println("Det er " + restsek+ "sekunder");
        System.out.println("Det er " + restmin+ "minutter");
        System.out.println("Det er " + timer + "timer" );
        sc.close();
    }   
}