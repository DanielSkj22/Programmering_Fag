package org.example.idatt2003;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class javafx extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        Button checkHand = new Button("Check Hand");
        Button dealHand = new Button("Deal Hand");
        dealHand.setLayoutX(150);
        dealHand.setLayoutY(200);
        checkHand.setLayoutX(650);
        checkHand.setLayoutY(200);
        checkHand.setPrefSize(200,200);
        dealHand.setPrefSize(200, 200);
        DeckOfCards deck = new DeckOfCards();
        checkHand.setOnAction(e-> deck.showHearts());
        dealHand.setOnAction(e-> deck.dealHand());
        Group group = new Group(dealHand, checkHand);
        Scene scene1 = new Scene(group,1000,1000, Color.AQUA);
        stage.setScene(scene1);
        stage.show();
    }
}
