package javaFiles.Home;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyHome extends Application {

    @Override
    public void start(Stage prStage) {

        //Code
        Text tx1 = new Text(10, 50, "Aditya");
        tx1.setFont(new Font(40));
        tx1.setFill(Color.MAROON);
        
        VBox vb1 = new VBox(tx1);
        vb1.setAlignment(Pos.CENTER);

        //Scene
        //Group gr = new Group(vb1);
        Scene sc = new Scene(vb1, 450, 100 );
        prStage.setScene(sc);
        sc.setFill(Color.ORANGE);
        sc.setCursor(Cursor.OPEN_HAND);

        //Stage
        prStage.setTitle("C2W_Assignment_1");
        prStage.setHeight(800);
        prStage.setWidth(1200);
        prStage.setResizable(false);
        prStage.centerOnScreen();
        prStage.getIcons().add(new Image("assets//images//MyIcon.png"));
        prStage.show();
    }

}