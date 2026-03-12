package org.example.idatt2003;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class javafx extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        Button checkHand = new Button("Check Hand");
        Button dealHand = new Button("Deal Hand");
        TextField queen = new TextField();
        TextField sum = new TextField();
        TextField hearts = new TextField();
        TextField flush = new TextField();
        flush.setLayoutX(650);
        flush.setLayoutY(650);
        hearts.setLayoutX(150);
        hearts.setLayoutY(650);
        sum.setLayoutX(650);
        sum.setLayoutY(800);
        queen.setLayoutX(150);
        queen.setLayoutY(800);
        dealHand.setLayoutX(150);
        dealHand.setLayoutY(200);
        checkHand.setLayoutX(650);
        checkHand.setLayoutY(200);
        checkHand.setPrefSize(200,200);
        dealHand.setPrefSize(200, 200);
        DeckOfCards deck = new DeckOfCards();
        checkHand.setOnAction(e-> {deck.showHand();
        queen.setPromptText(deck.queenOfSpades());
        sum.setPromptText(deck.handSum());
        hearts.setPromptText(deck.showHearts());
        flush.setPromptText(deck.flush());});
        dealHand.setOnAction(e-> deck.dealHand());
        Group group = new Group(dealHand, checkHand, queen, sum, hearts, flush);
        Scene scene1 = new Scene(group,1000,1000, Color.AQUA);
        stage.setScene(scene1);
        stage.show();
    }
}
