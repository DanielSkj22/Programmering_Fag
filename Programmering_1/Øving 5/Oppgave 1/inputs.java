public class inputs {
    private double teller;
    private double nevner;
    int nevner2 = 1;
    double resu = 0;

    public inputs(double teller, double nevner){
        if(nevner == 0){
            throw new IllegalArgumentException("Kan ikke bruke null");
        }else{
        this.teller = teller;
        this.nevner = nevner;
        }
    }
    public double getteller(){
        return teller;
    }
    public double getnevner(){
        return nevner;
    }
    public inputs(double teller){
        this.teller = teller;
    }
    public void add(inputs brok2){
        if (this.nevner == brok2.nevner){
            this.teller += brok2.teller;
        }else{
            resu = this.nevner / brok2.nevner;
            brok2.teller = brok2.teller * resu;
            brok2.nevner = brok2.nevner *resu;
            this.teller += brok2.teller;
        }
    }
    public void sub(inputs brok2){
        if (this.nevner == brok2.nevner){
            this.teller -= brok2.teller;
        }else{
            resu = this.nevner / brok2.nevner;
            brok2.teller = brok2.teller * resu;
            brok2.nevner = brok2.nevner *resu;
            this.teller -= brok2.teller;

        }
    }
    public void div(inputs brok2){
        this.teller *= brok2.nevner;
        this.nevner *= brok2.teller;
    }
    public void gang(inputs brok2){
        this.teller *= brok2.teller;
        this.nevner *= brok2.nevner;
    }
}

