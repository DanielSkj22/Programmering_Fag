package org.example.idatt2003;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class javafx extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        images image = new images();
        Button card = new Button();
        DeckOfCards deck = new DeckOfCards();
        card.setGraphic(image.spade(deck.random()));
        Group group = new Group(card);
        Scene scene1 = new Scene(group,1000,1000, Color.AQUA);
        stage.setScene(scene1);
        stage.show();
    }
}
