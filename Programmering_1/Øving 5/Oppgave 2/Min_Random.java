import java.util.Random;
import java.util.Scanner;
public class Min_Random {
}
class Heltall{
    Scanner input1 = new Scanner(System.in);
    int nedre = input1.nextInt(); 
    Scanner input2 = new Scanner(System.in);
    int ovre = input2.nextInt(); 
    Random r = new Random();
    int heltallet = r.nextInt(nedre, ovre);
}
class Desi{
    Scanner input1 = new Scanner(System.in);
    int nedre = input1.nextInt(); 
    Scanner input2 = new Scanner(System.in);
    int ovre = input2.nextInt(); 
    Random r = new Random();
    double desimal = r.nextDouble(nedre, ovre);
    }
