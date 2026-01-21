import java.util.ArrayList;

public class Rett {
    public ArrayList<String> Navn = new ArrayList<>();
    public ArrayList<String> Oppskrift = new ArrayList<>();
    public ArrayList<String> Type = new ArrayList<>();
    public ArrayList<Integer> Pris = new ArrayList<>();
    public ArrayList<Integer> sø = new ArrayList<>();

    public ArrayList<String> meny1 = new ArrayList<>();
    public int meny1pris = 0;

    public Rett(){
    }
    
    public ArrayList<String> getNavn(){
        return Navn;
    }
    public ArrayList<String> getOpp(){
        return Oppskrift;
    }
    public ArrayList<String> getType(){
        return Type;
    }
    public ArrayList<Integer> getPris(){
        return Pris;
    }
    public ArrayList<Integer> getSø(){
        return sø;
    }
    public void nyRett(String navn, String opp, String type, int pris ){
        Navn.add(navn);
        Oppskrift.add(opp);
        Type.add(type);
        Pris.add(pris);
    }
    public void søkType(String sk){
        sø.clear();
        for (int i = 0; i < Type.size(); i++){
            if (Type.get(i).equals(sk)){
                sø.add(i);
            }
        }
    }
    public void søkRett(String sk){
        sø.clear();
        for (int i = 0; i < Navn.size(); i++){
            if (Navn.get(i).equals(sk)){
                sø.add(i);
            }
        }
    }
    public void liste(int h){
        System.out.println(Navn.get(h)+" "+Oppskrift.get(h)+" "+Type.get(h)+" "+Pris.get(h));
    }
     public void nyMeny1(int input){
        meny1pris = meny1pris+Pris.get(input);
        meny1.add(Navn.get(input));
    }
}
