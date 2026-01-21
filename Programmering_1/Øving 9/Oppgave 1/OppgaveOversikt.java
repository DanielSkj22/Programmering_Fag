import java.util.ArrayList;

public class OppgaveOversikt {
    private int antStud;
    public ArrayList<Integer> oppgaverG = new ArrayList<Integer>();
    public ArrayList<String> studenter = new ArrayList<String>();

    public OppgaveOversikt(ArrayList<String> studenter,ArrayList<Integer> oppgaverG){
    }
    public void antall(){
        antStud = studenter.size();
    }
}
