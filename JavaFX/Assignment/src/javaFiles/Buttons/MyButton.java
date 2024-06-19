package javaFiles.Buttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyButton extends Application {

    @Override
    public void start(Stage prStage){

        //Code
    
        Label l1 = new Label("Hello Core2Web !!!");
        l1.setFont(new Font(20));
        l1.setTextFill(Color.BLACK);
        
        //Button-1
        Button btn1 = new Button("Core2Web - Super X");
            btn1.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello Core2Web - Super X");
                    
                }
                
            });
        btn1.autosize();
        btn1.setPrefWidth(180);
        btn1.setStyle("-fx-background-color:BLUE");

        //Button-2
        Button btn2 = new Button("Core2Web - Java");
            btn2.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello Core2Web - Java");
                }
                
            });
        btn2.autosize();
        btn2.setPrefWidth(180);
        btn2.setStyle("-fx-background-color:BLUE");

        //Button-3
        Button btn3 = new Button("Core2Web - DSA");
            btn3.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello Core2Web - DSA");
                }
                
            });
        btn3.autosize();
        btn3.setPrefWidth(180);
        btn3.setStyle("-fx-background-color:BLUE");

        //vb1
        VBox vb1 = new VBox(20, l1, btn1, btn2, btn3);
        vb1.setAlignment(Pos.CENTER);
        vb1.setLayoutX(400);
        vb1.setLayoutY(400);

        //Scene
        Group gr = new Group(vb1);
        Scene sc = new Scene(gr, 450, 100);
        prStage.setScene(sc);
        sc.setFill(Color.YELLOW);
        sc.setCursor(Cursor.OPEN_HAND);

        //Stage
        prStage.setTitle("MyButton");
        prStage.setHeight(1000);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));
        prStage.show();
    }

}