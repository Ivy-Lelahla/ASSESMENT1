package com.mycompany.assignment1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
//import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.ORANGE;
//import static javafx.scene.paint.Color.CHOCOLATE;
//import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Rectangle;
//import javafx.scene.shape.StrokeType;

public class PrimaryController {
    
    
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button Armenia;

    @FXML
    private Button Germany;

    @FXML
    private Button Hungary;

    @FXML
    private Button Lesotho;

    @FXML
    private Button Oman;

    @FXML
    private Rectangle Rect1;

    @FXML
    private Rectangle Rect2;

    @FXML
    private Rectangle Rect3;

    @FXML
    private Button Reset;

    @FXML
    void armeniaButton(ActionEvent event) {
        Rectangle Rect = new Rectangle(65, 5, 50, 40);
        Rect1.setFill(Color.RED);
          Rect2.setFill(Color.WHITE);
           Rect3.setFill(Color.GREEN);
           System.out.println("");
  Armenia.setStyle("-fx-background-color: RED");
    }

    @FXML
    void germanyButton(ActionEvent event) {
    Rectangle Rect = new Rectangle(65, 5, 50, 40);
        Rect1.setFill(Color.BLACK);
         Rect2.setFill(Color.BLUE);
          Rect3.setFill(Color.YELLOW);
          System.out.println("");
            Germany.setStyle("-fx-background-color:YELLOW ");
        
    }

    @FXML
    void hungaryButton(ActionEvent event) {
    Rectangle Rect = new Rectangle(65, 5, 50, 40);
         Rect1.setFill(Color.RED);
          Rect2.setFill(Color.WHITE);
           Rect3.setFill(Color.GREEN);
           System.out.println("");
             Hungary.setStyle("-fx-background-color: GREEN");

    }

    @FXML
    void lesothoButton(ActionEvent event) {
    Rectangle Rect = new Rectangle(65, 5, 50, 40);
          Rect1.setFill(Color.BLUE);
          Rect2.setFill(Color.WHITE);
           Rect3.setFill(Color.GREEN);
           System.out.println("");
             Lesotho.setStyle("-fx-background-color: BLUE");

    }

    @FXML
    void omanButton(ActionEvent event) {
    Rectangle Rect = new Rectangle(65, 5, 50, 40);
          Rect1.setFill(Color.WHITE);
          Rect2.setFill(Color.RED);
           Rect3.setFill(Color.GREEN);
           
           
           
           
           
           
           
           
           
           
           System.out.println("");
             Oman.setStyle("-fx-background-color: GREEN");

    }

    @FXML
    void resetButton(ActionEvent event) {
          Rect1.setFill(Color.WHITE);
           Rect2.setFill(Color.WHITE);
             Rect3.setFill(Color.WHITE);
    
        Reset.setStyle("-fx-background-color: #ffffff");
        AnchorPane.setStyle("-fx-background-color: LIME");
        
  /*            System.out.println("");
              System.out.println("");
              System.out.println("");
              System.out.println("");
              System.out.println("");
        
          someButton.setStyle("-fx-background-color: #ffffff");
        AnchorPane.setStroke(Color.BLACK);
        AnchorPane.setFill(Color.CHOCOLATE);*/

    }


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
           AnchorPane.setStyle("fx-background-color:#ffffff");

    }
}
