package org.example.idatt2003;

import java.util.Random;

public class DeckOfCards {
    Random rand = new Random();
    int noe = rand.nextInt(13)+1;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public void main(){
    }
    public int random(){
        Random rand = new Random();
        int noe = rand.nextInt(2)+1;
        return noe;
    }
}
