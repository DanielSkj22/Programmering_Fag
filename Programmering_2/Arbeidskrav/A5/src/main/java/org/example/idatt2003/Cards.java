package org.example.idatt2003;

public class Cards {
    private char type;
    private int sum;

    public Cards (char type, int sum){
        this.type = type;
        this.sum = sum;
    }

    public char getType(){
        return type;
    }
    public int getSum(){
        return sum;
    }
}
