import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrangementRegister obj = new ArrangementRegister();
        String fiks;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run){
        System.out.println("********************");
        System.out.println("1 for ny, 2 for søke sted, 3 for søke dato, 4 for å finne mellom datoer, 5 for liste");
        int input = sc.nextInt();
            switch (input) {
                case 1:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Navn");
                    String navn = sc.nextLine();
                    System.out.println("Sted");
                    String sted = sc.nextLine();
                    System.out.println("Arrangør");
                    String arr = sc.nextLine();
                    System.out.println("Type");
                    String type = sc.nextLine();
                    System.out.println("Dato");
                    Long tid = sc.nextLong();
                    obj.nyArr(navn, sted, arr, type, tid);
                    break;
                case 2:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Hvilket sted");
                    String søk = sc.nextLine();
                    obj.søkSted(søk);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(obj.getNavn().get(o));
                    }
                    break;
                case 3:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Hvilken dato");
                    Long finn = sc.nextLong()*10000-1;
                    Long finn2 = finn +2402;
                    obj.søkTid(finn, finn2);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(obj.getNavn().get(o));
                    }
                    break;
                case 4:
                    fiks = sc.nextLine();
                    System.out.println("**************");
                    System.out.println("Første dato");
                    Long tid1 = sc.nextLong()*10000-1;
                    System.out.println("Andre dato");
                    Long tid2 = sc.nextLong()*10000+1;
                    obj.mellomTid(tid1, tid2);
                    for (int j = 0; j < obj.getSø().size(); j++){
                        int o = obj.getSø().get(j);
                        System.out.println(" "+obj.getNavn().get(o));
                        System.out.println(obj.getTids().get(o));
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    obj.liste();
                    break;
                default:
                    run = false;
                    sc.close();
                    break;
            }
        }
        
    }
}
