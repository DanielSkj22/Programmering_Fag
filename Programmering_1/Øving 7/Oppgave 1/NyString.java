import java.util.Scanner;
public class NyString {
    public String setning;
    public Scanner sc = new Scanner(System.in);
    public String u = sc.nextLine().toLowerCase();

    public NyString(String setning){
        this.setning = setning;
        sc.close();
    }
    public void uten(){
        String regex = u;
        String[] my = setning.split(regex);
        for (String s : my) {
            System.out.print(s);
        }
    System.out.println();
    }
    public void forko(){
        String regex = " ";
        String[] me = setning.split(regex);
        int lengde = me.length;
        for(int i = 0; i < lengde; i++){
            char resu = me[i].charAt(0);
            System.out.print(resu+" ");
        }
    }
}


