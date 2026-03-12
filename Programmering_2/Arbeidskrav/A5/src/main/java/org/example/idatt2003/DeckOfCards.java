package org.example.idatt2003;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    private  ArrayList<Cards> fullDeck;
    private ArrayList<Integer> player;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public DeckOfCards(){
        fullDeck = new ArrayList<>();
        int cardCount = 0;
        while(fullDeck.size()<53){
            for(int i = 1; i < 14; i++){
                Cards newCard = new Cards(suit[cardCount], i);
                fullDeck.add(newCard);
            }
            cardCount = cardCount +1;
        }
    }

    public ArrayList<Cards> getFullDeck(){
        return fullDeck;
    }



    public void random(){
        player = new ArrayList<>();
        int count = 0;
        Random rand = new Random();
        int card = 0;
        while(count < 5){
            card = rand.nextInt(52)+1;
            player.add(card);
            count =count + 1;
        }
    }
    public void showHand(){
        for(int i = 0; i < player.size(); i++){
            System.out.println(player.get(i));
        }
    }
}
