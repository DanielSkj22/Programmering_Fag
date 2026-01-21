import static javax.swing.JOptionPane.*;

public class primtall {
    public static void main(String[] args) {
        boolean run = true;

        while(run){
            String tallLest = showInputDialog("Tall");

            if(tallLest.equals("q") || tallLest.equals("Q")){
                run = false;
            }else{
                try {
                    Double tall = Double.parseDouble(tallLest);
                    System.err.println(tall);
                    boolean prime = true;
                    if(tall==1){
                        prime = false;
                    }else{
                        for( int i = 2; i < tall; i++){
                            if(tall%i==0){
                                prime = false;
                            }
                        }
                    }
                    System.out.printf("Is %.2f a prime number: %b%n", tall, prime);
                }catch (NumberFormatException e) {
                    System.err.println(e);
                }
                
            }
            
        }
    }       
}