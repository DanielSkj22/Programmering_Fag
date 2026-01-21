import java.util.Arrays;
public class random{
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] liste = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] antall = new int[10];
        for (int i = 0; i < 1000; i++) {
            int tall = random.nextInt(10);
            antall[tall] += 1;
        }
    System.out.println(Arrays.toString(liste));
    System.out.println(Arrays.toString(antall));
    }
}
