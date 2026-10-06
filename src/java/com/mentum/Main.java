package com.mentum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.awt.*;

public class Main extends Application {

    public static void main(String[] args){
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
    try{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        Scene scene = new Scene(root, 500,500, Color.LIGHTCYAN);
        Image icon = new Image("icontest.png");
        stage.getIcons().add(icon);

        Text text = new Text();
        text.setFont(Font.font("Verdana",30));
        text.setFill(Color.RED);
        text.setText("Hello! Welcome to Mentum!");
        text.setX(30);
        text.setY(30);




//     stage.setWidth(600);
//     stage.setHeight(600);
//     stage.setResizable(false);
//     stage.setX(50);
//     stage.setY(50);
//     stage.setFullScreen(true);
//        root.getChildren().add(text);

        stage.setScene(scene);

        stage.show();
    }
    catch(Exception e){
        e.printStackTrace();
    }

    }
}
