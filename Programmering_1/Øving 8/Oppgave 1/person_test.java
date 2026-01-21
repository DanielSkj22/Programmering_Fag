import java.util.Scanner;
public class person_test {
    public static void main(String[] args) {
        ArbTaker obj = new ArbTaker();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        obj.setarbNr("123");
        obj.setansÅr(2019);

        while(run){
        System.out.println("*******************");
        System.out.println("Månedslønn");
        obj.setmånedLønn(sc.nextInt());
        System.out.println("Skatteprosent");
        obj.setskattPro(sc.nextDouble());
        System.out.println("1 for arbeider, 2 for ansettelsesår, 3 for årslønn brutto, 4 for skattetrekk og 5 for å avslutte");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                obj.taker();
                obj.alder();
                break;
            case 2:
                obj.ansatt();
                obj.veteran();
                break;
            case 3:
                obj.årslønn();
                break;
            case 4:
                obj.trekk();
                obj.årTrekk();
                break;
            case 5:
                run = false;
                break;
            default:
                break;
        }
    }

        sc.close();
    }
}
