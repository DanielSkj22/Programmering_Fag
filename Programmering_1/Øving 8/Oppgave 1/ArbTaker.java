import java.util.GregorianCalendar;
public class ArbTaker {
    Person obj = new Person();
    private String arbNr;
    private int ansÅr;
    private int månedLønn;
    private double skattPro;

    public String getarbNr(){
        return arbNr;
    }
     public int getansÅr(){
        return ansÅr;
    }
     public int getmånedLønn(){
        return månedLønn;
    }
     public double getskattPro(){
        return skattPro;
    }
    public void setarbNr(String newNR){
        this.arbNr = newNR;
    }
    public void setansÅr(int newÅR){
        this.ansÅr = newÅR;
    }
    public void setmånedLønn(int newLønn){
        this.månedLønn = newLønn;
    }
    public void setskattPro(double newPro){
        this.skattPro = newPro;
    }
    public void taker(){
        obj.setName("Daniel");
        obj.setName2("Skjørtorp");
        System.out.println("Arbeider nummer: " + arbNr);
        System.out.println(obj.getName1()+" "+ obj.getName());
    }
    public void årslønn(){
        System.out.println("Arbeids nummer: " + arbNr);
        System.out.println("Årslønn: " + månedLønn*12);
    }
    public void alder(){
        obj.setÅr("23");
        System.out.println(obj.getÅr()+ " År");
    }
    public void trekk(){
        System.out.println("Skattetrekk hver måned: " + månedLønn*skattPro);
    }
    public void årTrekk(){
        double trekk = månedLønn*skattPro;
        double trekken = trekk * 10;
        System.out.println("Skattetrekk på et helt år: " + (trekken + (trekk/2)));
    }
    public void ansatt(){
        GregorianCalendar kalender = new GregorianCalendar();
        int år = kalender.get(java.util.Calendar.YEAR);
        System.out.println(-(ansÅr-år)+" År ansatt");
    }
    public void veteran(){
        GregorianCalendar kalender = new GregorianCalendar();
        int år = kalender.get(java.util.Calendar.YEAR);
        if(-(ansÅr-år) > 4){
            System.out.println("Senior Dev");
        }
    }
}
