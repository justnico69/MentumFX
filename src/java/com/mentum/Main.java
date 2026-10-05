package com.mentum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.awt.*;

public class Main extends Application {

    public static void main(String[] args){
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {

     Group root = new Group();
     Scene scene = new Scene(root, Color.BLUE);
     Image icon = new Image("icontest.png");
     stage.getIcons().add(icon);

     stage.setWidth(420);
     stage.setHeight(420);
     stage.setResizable(false);
//     stage.setX(50);
//     stage.setY(50);
     stage.setFullScreen(true);

     stage.setTitle("Mentum");
     stage.setScene(scene);

    stage.show();
    }
}
