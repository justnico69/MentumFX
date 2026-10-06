package com.mentum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class MainController {

    @FXML
    private void initialize(){
        System.out.println("FXML loaded successfully");
    }

    @FXML
    private Circle circle;

    private double x;
    private double y;


    public void up(ActionEvent e){
        circle.setCenterY(y=-10);
//        System.out.println("UP");
    }
    public void down(ActionEvent e){
        circle.setCenterY(y=+10);
//        System.out.println("DOWN");
    }
    public void left(ActionEvent e){
//        System.out.println("LEFT");
        circle.setCenterX(x=-10);
    }
    public void right(ActionEvent e){
        circle.setCenterX(x=+10);
//        System.out.println("RIGHT");
    }
}
