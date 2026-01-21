import java.util.Scanner;

public class test_student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OppgaveOversikt obj2 = new OppgaveOversikt(null, null);
        Student obj = new Student();
        boolean run = true;
        int hvilken = 0;

        while (run) {
        System.out.println("Tast 1 for registrering" + " Tast 2 for å øke antall oppgaver fullført");
        System.out.println("Tast 3 for antall studenter" + " Tast 4 for å sjekke oppgaver til en student");
        System.out.println("Tast 5 for å avslutte");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                obj2.studenter.add(obj.getNavn());
                obj2.oppgaverG.add(0);
                System.out.println(obj2.studenter);
                    break;
                case 2:
                System.out.println("Hvilken Student");
                System.out.println(obj2.studenter);
                hvilken = sc.nextInt();
                hvilken += -1;
                obj.økAntOppg();
                int økning = obj.getAntOppg()+obj2.oppgaverG.get(hvilken);
                obj2.oppgaverG.add(hvilken, økning);
                obj2.oppgaverG.remove(hvilken + 1);
                System.out.println(obj2.oppgaverG);
                    break;
                case 3:
                int antall = obj2.studenter.size();
                System.out.println("Antall studenter " + antall);
                    break;
                case 4:
                System.out.println("Hvilken Student");
                System.out.println(obj2.studenter);
                hvilken = sc.nextInt();
                hvilken += -1;
                System.out.println(obj2.studenter.get(hvilken) +" " + obj2.oppgaverG.get(hvilken));
                    break;
                default:
                    run = false;
                    sc.close();
                    break;
            }
        } 
    }
}
