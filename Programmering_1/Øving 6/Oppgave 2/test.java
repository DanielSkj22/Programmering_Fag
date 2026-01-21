import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String output = scanner.nextLine().toLowerCase();
        analyse obj = new analyse(output);

        obj.antallBok();
        obj.prosent();
        obj.antallTyper();
        obj.enType();
        obj.antallMest();
    scanner.close();
    }
    }

