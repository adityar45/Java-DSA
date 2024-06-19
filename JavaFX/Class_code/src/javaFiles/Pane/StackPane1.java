package javaFiles.Pane;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPane1 extends Application {

    @Override
    public void start(Stage prStage){

        //Code
        Label l1= new Label( "Talk is Cheap Show me the Code");
        l1.setFont(new Font(40));
        Label l2= new Label("--------------                             ");
        l2.setFont(new Font(40));

        StackPane sPane = new StackPane();
        sPane.getChildren().addAll(l1,l2);
        
        //Scene
        Group gr = new Group();
        Scene sc = new Scene(sPane, 450, 100);
        prStage.setScene(sc);
        sc.setFill(Color.RED);
        sc.setCursor(Cursor.OPEN_HAND);
     
        //Stage
        prStage.setTitle("MyStackPane");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));
        prStage.show();
    }
}
