package org.example.idatt2003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private  ArrayList<Cards> fullDeck;
    private ArrayList<Cards> player;
    private final char[] suit = { 'S', 'H', 'D', 'C' };

    public DeckOfCards(){
        fullDeck = new ArrayList<>();
        int cardCount = 0;
        while(cardCount < 4){
            for(int i = 1; i < 14; i++){
                Cards newCard = new Cards(suit[cardCount], i);
                fullDeck.add(newCard);
            }
            cardCount = cardCount + 1;
        }
    }

    public ArrayList<Cards> getFullDeck(){
        return fullDeck;
    }



    public void dealHand(){
        player = new ArrayList<>();
        int count = 0;
        Random rand = new Random();
        int card = 0;
        while(count < 6){
            card = rand.nextInt(52);
            player.add(getFullDeck().get(card));
            count =count + 1;
        }
    }
    public void showHand(){
        showHearts();
        queenOfSpades();
        handSum();
        flush();
    }
    public String handSum(){
        int sum = 0;
        for(int i = 0; i < player.size(); i++){
            sum = sum + player.get(i).getSum();
        }
        return String.valueOf(sum);
    }
    public String showHearts(){
        char ting = 'H';
        String type = "";
        String tall = "";
        String result = "";
        List<Cards> list = player.stream()
                .filter(s -> s.getType()==ting)
                .toList();
        for(int i = 0; i < list.size(); i++){
           result = result.concat(String.valueOf(list.get(i).getType()));
           result = result.concat(String.valueOf(list.get(i).getSum()));
            result = result.concat(" ");
        }
        if(list.isEmpty()){
            result = "There are no hearts";
        }
        return result;
    }
    public String queenOfSpades(){
        String queenResult;
        Boolean queenSpade = false;
        for(int i = 0; i < player.size(); i++){
           if(player.get(i).getType()=='S' && player.get(i).getSum()==12){
               queenSpade = true;
           }
        }
        if(queenSpade == true){
            queenResult = "Yes";
        }
        else {
            queenResult = "No";
        }
        return queenResult;
    }
    public String flush(){
        char ting = 'H';
        String type = "";
        String result = "";
        List<Cards> list = player.stream()
                .filter(s -> s.getType()==player.get(0).getType())
                .toList();
        if(list.size() == 5){
            result = "Flush";
        }
        else {
            result = "No Flush";
        }
        return result;
    }
}
