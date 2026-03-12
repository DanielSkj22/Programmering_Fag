package org.example.idatt2003;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    private ArrayList<Integer> player;
    Random rand = new Random();
    int noe = rand.nextInt(13)+1;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public void main(){
    }
    public int random(){
        player = new ArrayList<>();
        int count = 0;
        Random rand = new Random();
        int card = 0;
        while(count < 5){
            card = rand.nextInt(52)+1;
            player.add(card);
            count =count + 1;
        }
        return card;
    }
    public void showHand(){
        for(int i = 0; i < player.size(); i++){
            System.out.println(player.get(i));
        }
    }
}
