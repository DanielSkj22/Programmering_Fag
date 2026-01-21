import java.util.ArrayList;

public class Arrangement{
    public ArrayList<String> Navn = new ArrayList<>();
    public ArrayList<String> Sted = new ArrayList<>();
    public ArrayList<String> Arrangør = new ArrayList<>();
    public ArrayList<String> Type = new ArrayList<>();
    public ArrayList<Long> Tidspunkt = new ArrayList<>();
    public ArrayList<Integer> sø = new ArrayList<>();


    public ArrayList<String> getNavn(){
        return Navn;
    }
    public ArrayList<String> getSted(){
        return Sted;
    }
    public ArrayList<String> getArr(){
        return Arrangør;
    }
    public ArrayList<String> getType(){
        return Type;
    }
    public ArrayList<Long> getTids(){
        return Tidspunkt;
    }
    public ArrayList<Integer> getSø(){
        return sø;
    }
}