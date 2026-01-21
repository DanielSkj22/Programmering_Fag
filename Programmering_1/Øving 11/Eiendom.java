import java.util.ArrayList;

public class Eiendom {
    private ArrayList<String> navn = new ArrayList<>();
    private ArrayList<Integer> komuneNr = new ArrayList<>();
    private ArrayList<Integer> gardsNr = new ArrayList<>();
    private ArrayList<Integer> bruksNr = new ArrayList<>();
    private ArrayList<String> eier = new ArrayList<>();
    private ArrayList<Float> areal = new ArrayList<>();

    public Eiendom(){
        navn = new ArrayList<>();
        komuneNr = new ArrayList<>();
        gardsNr = new ArrayList<>();
        eier = new ArrayList<>();
        areal = new ArrayList<>();
        bruksNr = new ArrayList<>();
    }
    public ArrayList<String>getNavn(){
        return navn;
    }
    public ArrayList<String>getEier(){
        return eier;
    }
    public ArrayList<Integer>getKomuneNr(){
        return komuneNr;
    }
    public ArrayList<Integer>getGardsNr(){
        return gardsNr;
    }
    public ArrayList<Integer>getBruksNr(){
        return bruksNr;
    }
    public ArrayList<Float>getAreal(){
        return areal;
    }
    public void nyEiendomString(String Navn, String Eier){
        navn.add(Navn);
        eier.add(Eier);
    }
    public void nyEiendomInt(int komunenr, int gardsnr, int bruksnr, float Areal){
        komuneNr.add(komunenr);
        gardsNr.add(gardsnr);
        bruksNr.add(bruksnr);
        areal.add(Areal);
    }
    public void slettEiendom(int tall){
        navn.remove(tall);
        eier.remove(tall);
        komuneNr.remove(tall);
        gardsNr.remove(tall);
        bruksNr.remove(tall);
        areal.remove(tall);
    }
    
}
