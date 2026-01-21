import java.util.Scanner;

public class testRett {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fiks;
        Rett obj = new Rett();
        Meny mat = new Meny(obj);
        boolean run = true;
        String søk;
        int valg = 0;

        while (run){
        System.out.println("********************");
        System.out.println("1 for ny rett, 2 for søke rett, 3 for å finne en type, 4 for å lage menyer, 5 for menyer innefor et prisintervall");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Navn");
                    String navn = sc.nextLine();
                    System.out.println("Oppskrift");
                    String opp = sc.nextLine();
                    System.out.println("Type");
                    String type = sc.nextLine();
                    System.out.println("Pris");
                    int pris = sc.nextInt();
                    obj.nyRett(navn, opp,type, pris);
                    break;
                case 2:
                fiks = sc.nextLine();
                System.out.println("**************");
                System.out.println("Hvilken rett");
                søk = sc.nextLine();
                obj.søkRett(søk);
                int h = obj.sø.get(0);
                System.out.println(obj.Navn.get(h)+" "+obj.Oppskrift.get(h)+" "+obj.Type.get(h)+" "+obj.Pris.get(h));
                    break;
                case 3:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Hvilken type");
                    søk = sc.nextLine();
                    obj.søkType(søk);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(obj.getNavn().get(o));
                    }
                    break;
                case 4:
                System.out.println("********************");
                System.out.println("1 for å legge til meny1 2 for meny2 og 3 for meny3");
                input = sc.nextInt();
                fiks = sc.nextLine();
                    switch (input) {
                        case 1:
                        System.out.println(obj.Navn);
                        System.out.println("Meny");
                        valg = sc.nextInt()-1;
                        mat.nyMeny1(valg);
                        System.out.println(mat.meny1+" "+mat.meny1pris);
                        break;
                    case 2:
                        System.out.println(obj.Navn);
                        System.out.println("Meny");
                        valg = sc.nextInt()-1;
                        mat.nyMeny2(valg);
                        System.out.println(mat.meny2+" "+mat.meny2pris);
                        break;
                    case 3:
                        System.out.println(obj.Navn);
                        System.out.println("Meny");
                        valg = sc.nextInt()-1;
                        mat.nyMeny3(valg);
                        System.out.println(mat.meny3+" "+mat.meny3pris);
                        break;
                    default:
                        System.out.println(mat.meny1);
                        System.out.println(mat.meny2);
                        System.out.println(mat.meny3);
                        break;
                }
                break;
                case 5:
                    System.out.println("********************");
                    fiks = sc.nextLine();
                    System.out.println("Fra pris");
                    int pris1 = sc.nextInt();
                    System.out.println("Til pris");
                    int pris2 = sc.nextInt();
                    mat.mellomPris(pris1, pris2); 
                    break;
                default:
                    run = false;
                    sc.close();
                    break;
            }
        }
        
    }
}
