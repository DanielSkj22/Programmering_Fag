package org.example.idatt2003;

import java.util.Random;

public class DeckOfCards {
    Random rand = new Random();
    int noe = rand.nextInt(52)+1;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public void main(){
        while(noe < 53 && noe > 0){
            int noe = rand.nextInt(52)+1;
            System.out.println(noe);
        }
    }
}
