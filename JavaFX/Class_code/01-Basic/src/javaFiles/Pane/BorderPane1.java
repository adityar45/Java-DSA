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

public class BorderPane1 extends Application {

    @Override
    public void start(Stage prStage){
        
        //Code
        Label top = new Label("Top");
        top.setTextFill(Color.BLACK);
        top.setFont(new Font(40));

        Label left = new Label("Left");
        left.setTextFill(Color.BLACK);
        left.setFont(new Font(40));

        Label center = new Label("Center");
        center.setTextFill(Color.BLACK);
        center.setFont(new Font(40));

        Label right = new Label("Right");
        right.setTextFill(Color.BLACK);
        right.setFont(new Font(40));

        Label bottom = new Label("Bottom");
        bottom.setTextFill(Color.BLACK);
        bottom.setFont(new Font(40));

        //BorderPane
        BorderPane bp = new BorderPane();
        bp.setTop(top);
        bp.setBottom(bottom);
        bp.setCenter(center);
        bp.setRight(right);
        bp.setLeft(left);

        //Scene
        Scene sc = new Scene(bp, 450, 100);
        prStage.setScene(sc);
        sc.setFill(Color.RED);
        sc.setCursor(Cursor.OPEN_HAND);

        //Stage
        prStage.setTitle("MyBorderPane");
        prStage.setHeight(800);
        prStage.setWidth(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/MyIcon.png"));
     
        prStage.show();
    }
    
}

