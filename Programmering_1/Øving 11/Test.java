import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eiendom eiendom = new Eiendom();
        EiendomsRegister register = new EiendomsRegister();
        String fiks;
        boolean run = true;
        int kommune = 0;
        int gards = 0;
        int bruks = 0;

        while (run) {
            System.out.println("*****************");
            System.out.println("1 for ny eiendom, 2 for å slette eiendom");
            System.out.println("3 for antall eiendommer, 4 for å finne eiendom");
            System.out.println("5 for å finne gårder med samme gårdsNr, 6 for gjennomsnitts areal");
            System.out.println("7 for å vise gårder");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Navn");
                    fiks = scanner.nextLine();
                    String navn = scanner.nextLine();
                    System.out.println("Eier");
                    String eier = scanner.nextLine();
                    eiendom.nyEiendomString(navn, eier);
                    System.out.println("Kommune nummer");
                    kommune = scanner.nextInt();
                    System.out.println("Gårds nummer");
                    gards = scanner.nextInt();
                    System.out.println("Bruks nummer");
                    bruks = scanner.nextInt();
                    System.out.println("Tomt areal");
                    float arealet = scanner.nextFloat();
                    eiendom.nyEiendomInt(kommune, gards, bruks, arealet);
                    break;
                case 2:
                    System.out.println(eiendom.getNavn());
                    input = scanner.nextInt() - 1;
                    eiendom.slettEiendom(input);
                    break;
                case 3:
                    System.out.println(register.antallEiendom(eiendom) + " Eiendommer");
                    break;
                case 4:
                    System.out.println("Hvilket kommune nummer");
                    kommune = scanner.nextInt();
                    System.out.println("Hvilket gårds nummer");
                    gards = scanner.nextInt();
                    System.out.println("Hvilket bruks nummer");
                    bruks = scanner.nextInt();
                    System.out.println(register.finnNr(kommune, gards, bruks, eiendom));
                    break;
                case 5:
                    register.printing(eiendom);
                    input = scanner.nextInt();
                    register.finnGårdsNr(eiendom, input);
                    break;
                case 6:
                    System.out.println(register.gjennomSnitt(eiendom) + " m2");
                    break;
                case 7:
                    System.out.println("************");
                    register.printing(eiendom);
                    break;
                default:
                    scanner.close();
                    run = false;
                    System.out.println("Ferdig");
                    break;
            }
        }
    }
}
