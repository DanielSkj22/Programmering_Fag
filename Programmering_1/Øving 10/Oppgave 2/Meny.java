import java.util.ArrayList;

public class Meny {
    public ArrayList<String> meny1 = new ArrayList<>();
    public int meny1pris = 0;
    public ArrayList<String> meny2 = new ArrayList<>();
    public int meny2pris = 0;
    public ArrayList<String> meny3 = new ArrayList<>();
    public int meny3pris = 0;
    Rett obj;

    public Meny(Rett rett) {
        this.obj = rett;
    }
    public void nyMeny1(int input){
        meny1pris = meny1pris+obj.Pris.get(input);
        meny1.add(obj.Navn.get(input));
    }
    public void nyMeny2(int input){
        meny2pris = meny2pris+obj.Pris.get(input);
        meny2.add(obj.Navn.get(input));
    }
    public void nyMeny3(int input){
        meny3pris = meny3pris+obj.Pris.get(input);
        meny3.add(obj.Navn.get(input));
    }
    public void mellomPris(int sk, int sp){
        if(meny1pris>sk&&meny1pris<sp){
            System.out.println(meny1);
        }
        if(meny2pris>sk&&meny2pris<sp){
            System.out.println(meny2);
        }
        if(meny3pris>sk&&meny3pris<sp){
            System.out.println(meny3);
        }
        }
    }
