package org.example.idatt2003;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class images {
    public ImageView spade (int noe){
        ImageView ja = null;
        ImageView one = new ImageView(new Image(getClass().getResource("/pictures/Spades/ace_S.png").toExternalForm()));
        ImageView two = new ImageView(new Image(getClass().getResource("/pictures/Spades/2_S.png").toExternalForm()));
        ArrayList<ImageView> list = new ArrayList<>();
        if( noe == 1){
            ja = one;
        }
        if(noe==2){
            ja = two;
        }
        return ja;
    }
}
