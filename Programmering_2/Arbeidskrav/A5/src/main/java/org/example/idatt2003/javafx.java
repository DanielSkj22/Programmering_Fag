package org.example.idatt2003;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class javafx extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        Button cardHand = new Button();
        cardHand.setLayoutX(375);
        cardHand.setLayoutY(200);
        cardHand.setText("Deal Hand");
        cardHand.setPrefSize(250, 250);
        DeckOfCards deck = new DeckOfCards();
        cardHand.setOnAction(e-> deck.random());
        Group group = new Group(cardHand);
        Scene scene1 = new Scene(group,1000,1000, Color.AQUA);
        stage.setScene(scene1);
        stage.show();
    }
}
