import java.util.Scanner;

public class teste_string {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String setning = sc.nextLine().toLowerCase();
    NyString obj = new NyString(setning);
    
    obj.uten();
    obj.forko();

    sc.close();
    }
}
