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
        
        prStage.setTitle("MyButton");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));

        //Label 1
        Label lb1 = new Label("Enter a username : ");
        lb1.setFont(new Font(40));
        TextField tx1 = new TextField();
        tx1.setMaxWidth(300);
        //tx1.setMinWidth(100);

        //Label 2
        Label lb2 = new Label("Enter password : ");
        lb2.setFont(new Font(40));
        PasswordField tx2 = new PasswordField();
        tx2.setMaxWidth(300);

        //Label 3
        Label lb3 = new Label();
        lb3.setFont(new Font(40));
        Label lb4 = new Label();
        lb4.setFont(new Font(40));

        //Button
        Button show = new Button("Show");
            show.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    //System.out.println(tx1.getText());
                    //System.out.println(tx2.getText());
                    lb3.setText(tx1.getText());
                    lb4.setText(tx2.getText());

                    //show.setLayoutX(50);
                }
                
            });
        //show.setAlignment(Pos.CENTER);
        show.autosize();

        //vb1
        VBox vb1 = new VBox(20, lb1, tx1, lb2, tx2, show, lb3, lb4);
        vb1.setAlignment(Pos.CENTER);
        vb1.getBorder();

        //Group
        //Group gr = new Group(vb1);
        
        Scene sc = new Scene(vb1, 450, 100);
        
        sc.setFill(Color.RED);
        sc.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(sc);

        prStage.show();
    }

}