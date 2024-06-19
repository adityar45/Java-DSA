package javaFiles.Pane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyPane extends Application {

    @Override
    public void start(Stage prStage){
        
        prStage.setTitle("MyPane");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));

        Label label1 = new Label("Good night !");
        label1.setTextFill(Color.BLACK);
        label1.setFont(new Font(40));

        //Pane
        Pane pane = new Pane();
        pane.getChildren().add(label1);
        
        Scene sc = new Scene(pane, 450, 100);
        
        sc.setFill(Color.RED);
        sc.setCursor(Cursor.OPEN_HAND);

        prStage.setScene(sc);

        prStage.show();

    }
    
}
