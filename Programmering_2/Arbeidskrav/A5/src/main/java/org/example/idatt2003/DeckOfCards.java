package org.example.idatt2003;

import java.util.Random;

public class DeckOfCards {
    Random rand = new Random();
    int noe = rand.nextInt(13)+1;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public void main(){
    }
    public int random(){
        int count = 0;
        Random rand = new Random();
        int card;
        while(count < 5){
            noe = rand.nextInt(52)+1;
            System.out.println(noe);
            count =count + 1;
        }
        return noe;
    }
}
