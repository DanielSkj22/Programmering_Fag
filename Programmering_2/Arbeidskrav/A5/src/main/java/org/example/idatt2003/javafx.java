package org.example.idatt2003;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class javafx extends Application {
    @Override
    public void start (Stage stage) throws IOException {
        Group group = new Group();
        Scene scene1 = new Scene(group,1000,1000, Color.AQUA);
        stage.show();
    }
}
