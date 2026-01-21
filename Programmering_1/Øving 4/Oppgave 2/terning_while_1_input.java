import java.util.Random;
import javax.swing.JOptionPane;

public class terning_while_1_input {
    public static void main(String[] args) {
        String userInput;
        player myplayer1 = new player ("Daniel");
        player myplayer2 = new player ("Alexander");
        boolean continueLoop = true;
        double sum = 0;
        double sum1 = 0;
        Random random = new Random();
        while(continueLoop){
            userInput = JOptionPane.showInputDialog(null);
            if(userInput.equals("q") || userInput.equals("Q")){
                continueLoop = false;
            }int dice = random.nextInt(6) + 1;
                if (dice == 1){
                    sum = 0 - 1;
                    }
                    int dice1 = random.nextInt(6) + 1;
                        if(dice1 == 1){
                            sum1 = 0 - 1;
                            }
            System.out.println(dice);
            System.out.println(dice1);
            sum += dice;
            sum1 += dice1;
            if((sum >= 100) || (sum1 >= 100)){
                continueLoop = false;
            }
        System.out.println(sum);
        System.out.println(sum1);
    if(sum >= 100){
        System.out.println(myplayer1.getName()+" vant");
    }if(sum1 >= 100){
        System.out.println(myplayer2.getName()+" vant");
    }
    }
    }
}
