import java.util.ArrayList;

public class EiendomsRegister {
    Eiendom eiendom = new Eiendom();
    private ArrayList<Integer> sortering = new ArrayList<>();
    private String finn;

    public ArrayList<Integer> getSortering(){
        return sortering;
    }
    public int antallEiendom(Eiendom eiendom){
        int antall = eiendom.getNavn().size();
        return antall;
    }
    public float gjennomSnitt(Eiendom eiendom){
        float gjennom = 0;
        for ( int i = 0; i<eiendom.getAreal().size(); i++){
            gjennom += eiendom.getAreal().get(i);
        }
        return gjennom/eiendom.getAreal().size();
    }
    public void finnGårdsNr(Eiendom eiendom, int nummer){
        sortering.clear();
        int ant = 0;
        for (int i = 0; i<eiendom.getNavn().size(); i++){
            if(eiendom.getGardsNr().get(i).equals(nummer)){
                sortering.add(i);
            }
        }
        for (int j = 0; j<sortering.size(); j++){
            ant = sortering.get(j);
            System.out.println(eiendom.getNavn().get(ant));
        }
    }
    public String finnNr(int kommune, int gards, int bruks, Eiendom eiendom){
          for ( int i = 0; i<eiendom.getAreal().size(); i++){
            if(eiendom.getKomuneNr().get(i).equals(kommune)&&eiendom.getGardsNr().get(i).equals(gards)&&eiendom.getBruksNr().get(i).equals(bruks)){
                finn = eiendom.getNavn().get(0);
            }
            else{
                finn = "finner ingen";
            }
        }
        return finn;
    }
    public void printing(Eiendom eiendom){
        for(int i = 0; i<eiendom.getNavn().size(); i++){
            System.out.println(eiendom.getNavn().get(i));
            System.out.println(eiendom.getEier().get(i));
            System.out.println(eiendom.getKomuneNr().get(i)+"-"+eiendom.getGardsNr().get(i)+"/"+eiendom.getBruksNr().get(i));
            System.out.println(eiendom.getAreal().get(i));
            System.out.println("***************");
    }
}
}